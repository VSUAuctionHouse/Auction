package server;// This file contains material supporting section 3.7 of the textbook:// "Object Oriented Software Engineering" and is issued under the open-source// license found at www.lloseng.com import java.awt.event.ActionEvent;import java.awt.event.ActionListener;import java.io.*;import java.util.ArrayList;import javax.swing.Timer;import Users.GuestUser;import ocsf.server.*;import common.*;/** * This class overrides some of the methods in the abstract  * superclass in order to give more functionality to the server. * * @author Dr Timothy C. Lethbridge * @author Dr Robert Lagani&egrave;re * @author Fran&ccedil;ois B&eacute;langer * @author Paul Holden * @version July 2000 */public class EchoServer extends AbstractServer {   //Class variables *************************************************	//ArrayList<Item> items = Globals.items;	//ArrayList<Auction> auctions = Globals.auctions;	ArrayList<Item> items = new ArrayList<Item>();	ArrayList<Auction> auctions = new ArrayList<Auction>();  	  int userid = 0;  double asking_increment = 0;    //ActionListeners for Timers  ActionListener Going_Once = new ActionListener(){	  	public void actionPerformed(ActionEvent evt)  	{	  	Globals.sv.sendToAllClients("Going Once");	  	Globals.sv.sendToAllClients(auctions.get(0).getBid());	  	going_once.start();  	}  };    ActionListener Going_Twice = new ActionListener(){	  	public void actionPerformed(ActionEvent evt)  	{	  	Globals.sv.sendToAllClients("Going Twice");	  	Globals.sv.sendToAllClients(auctions.get(0).getBid());	  	going_twice.start();  	}  };    ActionListener Sold = new ActionListener(){	  	public void actionPerformed(ActionEvent evt)  	{	  	Globals.sv.sendToAllClients("Sold!");  	}  };    //Timers  Timer auction_timer = new Timer(10000, Going_Once);  Timer going_once = new Timer(5000, Going_Twice);  Timer going_twice = new Timer(10000, Sold);      //Constructors ****************************************************    /**   * Constructs an instance of the echo server.   *   * @param port The port number to connect on.   */  public EchoServer(int port)   {    super(port);  }    //Instance methods ************************************************    /**   * This method handles any messages received from the client.   *   * @param msg The message received from the client.   * @param client The connection from which the message originated.   */	public void handleMessageFromClient ( Object msg, ConnectionToClient client )	{		//items.add(newItem);		//See if String		if( msg instanceof String)		{			String compare= "items";			if (msg.equals(compare)){				try {					client.sendToClient(items);				} catch (IOException e) {					// TODO Auto-generated catch block					e.printStackTrace();				}				System.out.println("Sending Items");			}			else{			//Send back Confirmation of Connection			try {				client.sendToClient("Connection Good");			} catch (IOException e) {				// TODO Auto-generated catch block				e.printStackTrace();			}			}		}								// See if message is a Item		if( msg instanceof Item)		{			// Cast message as an Item			Item i1 = (Item)msg;			items.add(i1);			asking_increment = i1.getStarting_bid();						System.out.println("Item Received");						System.out.println(i1);						// Send Message to the client that sent original Item.			try {				client.sendToClient("Item Received");			} catch (IOException e) {				// TODO Auto-generated catch block				e.printStackTrace();			}						// Send Item to all clients.			this.sendToAllClients(i1);						//Add Item to database								}				if(msg instanceof Auction)		{			Auction auction = (Auction)msg;			auction = new Auction(items.get(0));			items.remove(0);			auctions.add(auction);			asking_increment = auction.getItem().getStarting_bid();			System.out.println("Auction Started");			this.sendToAllClients("Auction Started");			this.sendToAllClients(auction.getItem());			this.sendToAllClients("Starting Bid: " + auction.getBid().getAsking_bid());			this.sendToAllClients(auction.getBid());			auction_timer.start();						//Add Auction to database					}				if(msg instanceof GuestUser){			setUsers();			((GuestUser) msg).userId(getUsers());			System.out.println("New User: User Id: "+ ((GuestUser) msg).getUserId());						//****************************************			//STORE USER INFO			//****************************************											}				if(msg instanceof Bid)		{			auction_timer.restart();			if(going_once.isRunning())			going_once.stop();			if(going_twice.isRunning())			going_twice.stop();						Bid bid = (Bid)msg;			auctions.get(0).setBid(bid);						if(bid.isIs_asking_bid())			{				bid.setCurrent_bid(bid.getAsking_bid());				bid.setAsking_bid(bid.getAsking_bid()+asking_increment);				bid.setIs_asking_bid(false);				this.sendToAllClients(bid);			}			else			{				bid.setCurrent_bid(bid.getCustom_bid());				if(bid.getAsking_bid()+asking_increment < bid.getCurrent_bid())				{					asking_increment = bid.getCustom_bid() - bid.getAsking_bid();					bid.setAsking_bid(bid.getCurrent_bid()+asking_increment);				}				else				{					bid.setAsking_bid(bid.getAsking_bid() + asking_increment);				}				bid.setCustom_bid(0);				this.sendToAllClients(bid);			}		}		  }	      /**   * This method overrides the one in the superclass.  Called   * when the server starts listening for connections.   */  protected void serverStarted()  {    System.out.println      ("Server listening for connections on port " + getPort());  }    /**   * This method overrides the one in the superclass.  Called   * when the server stops listening for connections.   */  protected void serverStopped()  {    System.out.println      ("Server has stopped listening for connections.");  }    public void setUsers()  {	  userid++;  }    public int getUsers()  {	  return userid;  }    //Class methods ***************************************************    /**   * This method is responsible for the creation of    * the server instance (there is no UI in this phase).   *   * @param args[0] The port number to listen on.  Defaults to 5555    *          if no argument is entered.   */  public static void main(String[] args)   {    int port = 0; //Port to listen on    try    {      port = Integer.parseInt(args[0]); //Get port from command line    }    catch(Throwable t)    {      port = Globals.DEFAULT_PORT; //Set port to 5555    }        Globals.sv = new EchoServer(port);        try     {      Globals.sv.listen(); //Start listening for connections    }     catch (Exception ex)     {      System.out.println("ERROR - Could not listen for clients!");    }  }}//End of EchoServer class