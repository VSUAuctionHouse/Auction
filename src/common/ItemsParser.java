package common;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class ItemsParser 
{
	ArrayList<Item> items_list = new ArrayList<Item>();
	Document items;
	File file = new File("src\\database\\items.xml");
	
	public ItemsParser()
	{
		
	}
	
	public void parseXmlFile(){
		//get the factory
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

		try {

			//Using factory get an instance of document builder
			DocumentBuilder db = dbf.newDocumentBuilder();

			//parse using builder to get DOM representation of the XML file
			items = db.parse("src\\database\\items.xml");


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
		Element docEle = items.getDocumentElement();

		//get a nodelist of elements
		NodeList nl = docEle.getElementsByTagName("Item");
		if(nl != null && nl.getLength() > 0) {
			for(int i = 0 ; i < nl.getLength();i++) {

				//get the item element
				Element el = (Element)nl.item(i);

				//get the Item object
				Item item = getItem(el);

				//add it to list
				items_list.add(item);
			}
		}
		
		Globals.items = items_list;
	}
	
	Item getItem(Element item) {
		
		//gets value for each variable
		String name = getTextValue(item,"Name");
		String Desc = getTextValue(item,"Description");
		double starting_bid = getDoubleValue(item,"starting_bid");
		double reserve = getDoubleValue(item, "reserve");

		//Create a new Item with the value read from the xml nodes
		Item i = new Item(name, Desc, starting_bid, reserve);

		return i;
	}
	
	public String printList()
	{
		String items_list_text = "";
		Iterator<Item> it = items_list.iterator();
		while(it.hasNext())
		{
			Item i = it.next();
			items_list_text += i.toString();
		}
		
		
		return items_list_text;
	}
	
	public String getTextValue(Element ele, String tagName) {
		String textVal = null;
		NodeList nl = ele.getElementsByTagName(tagName);
		if(nl != null && nl.getLength() > 0) {
			Element el = (Element)nl.item(0);
			textVal = el.getFirstChild().getNodeValue();
		}

		return textVal;
	}
	
	public double getDoubleValue(Element ele, String tagName) {
		//in production application you would catch the exception
		return Double.parseDouble(getTextValue(ele,tagName));
	}
	
	public Element createItemElement(Item i)
	{
		Element itemEle = items.createElement("Item");
		
		Element NameEle = items.createElement("Name");
		Text NameText = items.createTextNode(i.getName());
		NameEle.appendChild(NameText);
		itemEle.appendChild(NameEle);
		
		Element descEle = items.createElement("Description");
		Text descText = items.createTextNode(i.getDescription());
		descEle.appendChild(descText);
		itemEle.appendChild(descEle);
		
		Element starting_bidEle = items.createElement("starting_bid");
		Text starting_bidText = items.createTextNode(String.valueOf(i.getStarting_bid()));
		starting_bidEle.appendChild(starting_bidText);
		itemEle.appendChild(starting_bidEle);
		
		Element reserveEle = items.createElement("reserve");
		Text reserveText = items.createTextNode(String.valueOf(i.getReserve()));
		reserveEle.appendChild(reserveText);
		itemEle.appendChild(reserveEle);
		
		items.appendChild(itemEle);
		
		return itemEle;
	
	}
	
	public void printToFile()
	{
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t;
		try {
			t = tf.newTransformer();
			Source source = new DOMSource(items);
			StreamResult result = new StreamResult(file);
			
			t.transform(source, result);
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
