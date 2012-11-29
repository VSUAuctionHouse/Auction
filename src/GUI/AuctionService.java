package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;

import common.Item;

import client.console.ClientConsole;

import Users.GuestUser;

import java.awt.Panel;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Timer;

public class AuctionService extends JFrame {

	private JPanel contentPane;
	static JPanel panels;
	static String sAddress1="";
	static String sAddress2="";
	static String sAddress3="";
	static String bAddress1="";
	static String bAddress2="";
	static String bAddress3="";
	static String sCity="";
	static String sState="";
	static String sZip="";
	static String bCity="";
	static String bState="";
	static String bZip="";
	static int id=0;
	static String fName="";
	static String lName="";
	static String mName="";
	static String ccNumber="";
	static String expDate="";
	static String cardType="";
	static GuestUser user= new GuestUser();
	public static ArrayList <Item> items = new ArrayList <Item> ();
	static ClientConsole chat= new ClientConsole("localhost", 5555);
	/**
	 * Launch the application.
	 */
	
	
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AuctionService frame = new AuctionService();
					frame.setVisible(true);
					chat.getList();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AuctionService() {
		setTitle("Auction Services");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 500);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmCancel = new JMenuItem("Cancel");
		mntmCancel.setEnabled(false);
		mntmCancel.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.SHIFT_MASK));
		mnFile.add(mntmCancel);
		
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.SHIFT_MASK));
		mnFile.add(mntmExit);
		
		JMenu mnTools = new JMenu("Tools");
		menuBar.add(mnTools);
		
		JMenuItem mntmLogOut = new JMenuItem("Log Out");
		mntmLogOut.setEnabled(false);
		mntmLogOut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.SHIFT_MASK));
		mnTools.add(mntmLogOut);
		
		JMenuItem mntmCreateAuctions = new JMenuItem("Create Auction");
		mntmCreateAuctions.setEnabled(false);
		mntmCreateAuctions.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.SHIFT_MASK));
		mnTools.add(mntmCreateAuctions);
		
		JMenuItem mntmSelect = new JMenuItem("Select");
		mntmSelect.setEnabled(false);
		mntmSelect.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.SHIFT_MASK));
		mnTools.add(mntmSelect);
		
		JMenu mnView = new JMenu("View");
		menuBar.add(mnView);
		
		JMenuItem mntmHome = new JMenuItem("Home");
		mntmHome.setEnabled(false);
		mntmHome.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, InputEvent.SHIFT_MASK));
		mnView.add(mntmHome);
		
		JMenuItem mntmViewBids = new JMenuItem("View Bids");
		mntmViewBids.setEnabled(false);
		mntmViewBids.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, InputEvent.SHIFT_MASK));
		mnView.add(mntmViewBids);
		
		JMenuItem mntmViewAuctions = new JMenuItem("View Auctions");
		mntmViewAuctions.setEnabled(false);
		mntmViewAuctions.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.SHIFT_MASK));
		mnView.add(mntmViewAuctions);
		
		JMenuItem mntmCart = new JMenuItem("Cart");
		mntmCart.setEnabled(false);
		mntmCart.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.SHIFT_MASK));
		mnView.add(mntmCart);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmManual = new JMenuItem("Manual");
		mntmManual.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, InputEvent.SHIFT_MASK));
		mnHelp.add(mntmManual);
		getContentPane().setLayout(null);
		
		//Creating panels for diffrent layouts
		JPanel panel1 = new Startup();
		JPanel panel2= new UserInfo();
		JPanel panel3= new CreditCardInfo();
		JPanel panel4= new Main();
		JPanel panel5= new LiveAuctions();
		JPanel panel6= new Auction();
		JPanel panel7= new UserName();
		JPanel panel8= new newItem();
		JPanel panel9= new Cart();
		JPanel panel10=new ViewBids();
		
		panels = new JPanel(new CardLayout());
		panels.setBounds(0, 0, 777, 392);
		getContentPane().add(panels);
		panels.add(panel1,"Startup");
		panels.add(panel2, "UserInfo");
		panels.add(panel3, "CreditCardInfo");
		panels.add(panel4, "Main");
		panels.add(panel5, "LiveAuctions");
		panels.add(panel6, "Auction");
		panels.add(panel7, "UserName");
		panels.add(panel8, "CreateItem");
		panels.add(panel9, "Cart");
		panels.add(panel10, "ViewBids");
		
		
		CardLayout cl = (CardLayout)(panels.getLayout());
	    cl.show(panels, "Startup");
		
	    chat.accept();
	    
	    
	    
	    
	    
	    
	}
	public static void createUser() {
		user.setSAddress1(sAddress1);
		user.setSAddress2(sAddress2);
		user.setSAddress3(sAddress3);
		user.setBAddress1(bAddress1);
		user.setBAddress2(bAddress2);
		user.setBAddress3(bAddress3);
		user.setSCity(sCity);
		user.setSState(sState);
		user.setSZip(sZip);
		user.setBCity(bCity);
		user.setBState(bState);
		user.setBZip(bZip);
		user.setccNumber(ccNumber);
		user.setexpDate(expDate);
		user.setcardType(cardType);
		user.setfName(fName);
		user.setlName(lName);
		user.setmName(mName);
		String number="number";
	}
	
	public static void setList(ArrayList a1){
		items=a1;
		LiveAuctions.list.removeAll();
		for(int i=0;i<a1.size();i++){
			Item i1= (Item) a1.get(i);
			LiveAuctions.list.add(i1.getName());
		}
		
		 AuctionService.chat.received("");
	}
	
	public static void gotItem(Item i1){
		LiveAuctions.list.add(i1.getName());
		items.add(i1);
	}
}
