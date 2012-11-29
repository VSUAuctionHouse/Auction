package common;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class BidParser 
{
	Document bids;
	
	public BidParser()
	{
		
	}
	
	public Element createBidElement(Bid b)
	{
		Element bidEle = bids.createElement("Item");
		
		Element current_bidEle = bids.createElement("starting_bid");
		Text current_bidText = bids.createTextNode(String.valueOf(b.getCurrent_bid()));
		current_bidEle.appendChild(current_bidText);
		bidEle.appendChild(current_bidEle);
		
		Element custom_bidEle = bids.createElement("starting_bid");
		Text custom_bidText = bids.createTextNode(String.valueOf(b.getCustom_bid()));
		current_bidEle.appendChild(custom_bidText);
		bidEle.appendChild(custom_bidEle);
		
		Element asking_bidEle = bids.createElement("reserve");
		Text asking_bidText = bids.createTextNode(String.valueOf(b.getAsking_bid()));
		asking_bidEle.appendChild(asking_bidText);
		bidEle.appendChild(asking_bidEle);
		
		Element is_asking_bidEle = bids.createElement("is_asking_bid");
		Text is_asking_bidText = bids.createTextNode(String.valueOf(b.isIs_asking_bid()));
		is_asking_bidEle.appendChild(is_asking_bidText);
		bidEle.appendChild(is_asking_bidEle);
		
		Element has_highest_bidEle = bids.createElement("has_highest_bid");
		Text has_highest_bidText = bids.createTextNode(String.valueOf(b.isHas_highest_bid()));
		has_highest_bidEle.appendChild(has_highest_bidText);
		bidEle.appendChild(has_highest_bidEle);
		
		return bidEle;
	
	}
	
}
