package common;

import java.io.Serializable;

public class Item implements Serializable
{
	//Class Variables
	String Name;
	String Description;
	double starting_bid;
	double reserve;
	//int Owner;
	
	public Item()
	{
		this.Name = "";
		this.Description = "";
		this.starting_bid = 1;
		this.reserve = 0;
	}
	
	public Item(String Name, String Description, double starting_bid, double reserve)
	{
		this.Name = Name;
		this.Description = Description;
		this.starting_bid = starting_bid;
		this.reserve = reserve;
	}
	
	public double getStarting_bid() 
	{
		return starting_bid;
	}
	
	public void setStarting_bid(double starting_bid) 
	{
		this.starting_bid = starting_bid;
	}
	
	public String getName() 
	{
		return Name;
	}
	
	public void setName(String name) 
	{
		Name = name;
	}
	
	public String getDescription() 
	{
		return Description;
	}
	
	public void setDescription(String description) 
	{
		Description = description;
	}
	
	public double getReserve() 
	{
		return reserve;
	}
	
	public void setReserve(double reserve) 
	{
		this.reserve = reserve;
	}
	
	public String toString()
	{
		String current = "Item Added: " + this.Name + "\nItem Description: " + this.Description;
		
		if(this.reserve > 0)
		{
			current += "\nItem has a Reserve";
		}
		
		else
		{
			current += "\nItem has no Reserve";
		}
		
		return current;
	}
}
