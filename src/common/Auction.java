package common;

import java.io.Serializable;

public class Auction implements Serializable
{
	//Class Variables
	
	Item item;
	Bid bid;
	double winning_bid;
	int Winning_client;
	boolean reserve_met;
	
	public Auction()
	{
		this.bid = new Bid(0);
		this.item = new Item();
		this.winning_bid = 0;
		this.Winning_client = 0;
		this.reserve_met = false;
	}
	
	public Auction(Item item)
	{
		this.bid = new Bid(item.getStarting_bid());
		this.item = item;
		this.winning_bid = 0;
		this.Winning_client = 0;
		this.reserve_met = false;
		
	}
	
	public Auction(Item item, Bid bid, Double winning_bid, int Winning_client, boolean reserve_met)
	{
		this.item = item;
		this.bid = bid;
		this.winning_bid = winning_bid;
		this.Winning_client = Winning_client;
		this.reserve_met = reserve_met;
	}
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double getWinning_bid() {
		return winning_bid;
	}
	public void setWinning_bid(double winning_bid) {
		this.winning_bid = winning_bid;
	}
	public int getWinning_Client() {
		return Winning_client;
	}
	public void setWinning_Client(int winning_Client) {
		this.Winning_client = winning_Client;
	}
	public boolean isReserve_met() {
		return reserve_met;
	}
	public void setReserve_met(boolean reserve_met) {
		this.reserve_met = reserve_met;
	}
	public Bid getBid() {
		return bid;
	}
	public void setBid(Bid bid) {
		this.bid = bid;
	}
}
