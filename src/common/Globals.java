package common;

import java.util.ArrayList;

import server.EchoServer;

public class Globals 
{
	final public static int DEFAULT_PORT = 5555;
	public static EchoServer sv = new EchoServer(DEFAULT_PORT);
	public static ArrayList<Item> items;
	public static ArrayList<Auction> auctions;
	
}
