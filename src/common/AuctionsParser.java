package common;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class AuctionsParser 
{
	ItemsParser items_parser = new ItemsParser();
	ArrayList<Auction> Auction_list = new ArrayList<Auction>();
	Document auctions;
	
	public AuctionsParser()
	{
		
	}
	
	public void parseXmlFile(){
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {

			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			//parse using builder to get DOM representation of the XML file
			auctions = db.parse("auctions.xml");


		}catch(ParserConfigurationException pce) {
			pce.printStackTrace();
		}catch(SAXException se) {
			se.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public void parseDocument(){
		//get the root element
		Element docEle = auctions.getDocumentElement();

		//get a nodelist of elements
		NodeList nl = docEle.getElementsByTagName("Item");
		if(nl != null && nl.getLength() > 0) {
			for(int i = 0 ; i < nl.getLength();i++) {

				//get the employee element
				Element el = (Element)nl.item(i);

				//get the Employee object
				Auction auction = getAuction(el);

				//add it to list
				Auction_list.add(auction);
			}
		}
		
		Globals.auctions = Auction_list;
	}
	
	private Auction getAuction(Element auction) {

		//for each <employee> element get text or int values of
		//name ,id, age and name
		Item item = getItem(auction, "Item");
		Bid bid = getBid(auction,"Bid");
		double winning = getDoubleValue(auction,"winning_bid");
		int winning_client = getIntValue(auction,"Winning_client");
		boolean reserve_met = getBoolValue(auction, "reserve_met");

		//Create a new Employee with the value read from the xml nodes
		Auction a = new Auction(item, bid, winning, winning_client, reserve_met);

		return a;
	}
	
	public Item getItem(Element ele, String tagName)
	{
		Item item = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength()>0)
		{
			Element el=(Element)nl.item(0);
			item = items_parser.getItem(el);
		}
		
		return item;
	}
	
	public Bid getBid(Element ele, String tagName)
	{
		Bid b = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength()>0)
		{
			Element el = (Element)nl.item(0);
			double asking = getDoubleValue(el, "asking_bid");
			b = new Bid(asking);
		}
		
		return b;
	}
	
	public boolean getBoolValue(Element ele, String tagName)
	{
		return Boolean.parseBoolean(getTextValue(ele, tagName));
	}
	
	private String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}
	
	private double getDoubleValue(Element ele, String tagName) {
		//in production application you would catch the exception
		return Double.parseDouble(getTextValue(ele,tagName));
	}
	
	private int getIntValue(Element ele, String tagName) {
		//in production application you would catch the exception
		return Integer.parseInt(getTextValue(ele,tagName));
	}
	
	public void createDoc()
	{
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			auctions = db.newDocument();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void createDOMTree()
	{
		Element rootEle = auctions.createElement("Auctions");
		auctions.appendChild(rootEle);
		
		Iterator<Auction> it = Auction_list.iterator();
		while(it.hasNext())
		{
			Auction a = (Auction)it.next();
			Element auctionEle = createAuctionElement(a);
			rootEle.appendChild(auctionEle);
		}
	}
	
	public Element createAuctionElement(Auction a)
	{
		Element auctionEle = auctions.createElement("Auction");
		
		ItemsParser ip = new ItemsParser();
		Element itemEle = ip.createItemElement(a.getItem());
		auctionEle.appendChild(itemEle);
		
		BidParser bp = new BidParser();
		Element bidEle = bp.createBidElement(a.getBid());
		auctionEle.appendChild(bidEle);
		
		Element winning_bidEle = auctions.createElement("winning_bid");
		Text winning_bidText = auctions.createTextNode(String.valueOf(a.getWinning_bid()));
		winning_bidEle.appendChild(winning_bidText);
		auctionEle.appendChild(winning_bidEle);
		
		Element winning_clientEle = auctions.createElement("Winning_client");
		Text winning_clientText = auctions.createTextNode(String.valueOf(a.getWinning_Client()));
		winning_clientEle.appendChild(winning_clientText);
		auctionEle.appendChild(winning_clientEle);
		
		Element reserve_metEle = auctions.createElement("winning_bid");
		Text reserve_metText = auctions.createTextNode(String.valueOf(a.isReserve_met()));
		reserve_metEle.appendChild(reserve_metText);
		auctionEle.appendChild(reserve_metEle);
		
		return auctionEle;
	
	}
	
	public void printToFile()
	{
		try{
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		DOMSource source = new DOMSource(auctions);
		StreamResult result = new StreamResult(new File("C:\\Users\\Biggers\\Documents\\AuctionService\\src\\database\\auctions.xml"));
		
		t.transform(source, result);
		} catch(TransformerException tfe)
		{
			tfe.printStackTrace();
		}
		
	}

}
