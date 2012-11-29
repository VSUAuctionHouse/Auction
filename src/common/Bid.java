package common;

import java.io.Serializable;

public class Bid implements Serializable
{
	
	//Class Variables
	double current_bid;
	double custom_bid;
	double asking_bid;
	boolean is_asking_bid;
	boolean has_highest_bid;
	
	public Bid(double asking_bid)
	{
		this.asking_bid = asking_bid;
		this.current_bid = 0;
		this.custom_bid = 0;
		this.has_highest_bid = false;
		this.is_asking_bid = false;
	}

	public double getAsking_bid() {
		return asking_bid;
	}

	public void setAsking_bid(double asking_bid) {
		this.asking_bid = asking_bid;
	}

	public double getCustom_bid() {
		return custom_bid;
	}

	public void setCustom_bid(double custom_bid) {
		this.custom_bid = custom_bid;
	}

	public boolean isIs_asking_bid() {
		return is_asking_bid;
	}

	public void setIs_asking_bid(boolean is_asking_bid) {
		this.is_asking_bid = is_asking_bid;
	}

	public double getCurrent_bid() {
		return current_bid;
	}

	public void setCurrent_bid(double current_bid) {
		this.current_bid = current_bid;
	}
	
	public boolean isHas_highest_bid() {
		return has_highest_bid;
	}

	public void setHas_highest_bid(boolean has_highest_bid) {
		this.has_highest_bid = has_highest_bid;
	}
	
	public String toString()
	{
		String bid = "Current Bid: " + this.current_bid;
		return bid;
	}
	
	
}
