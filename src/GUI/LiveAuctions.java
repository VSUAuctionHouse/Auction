package GUI;

import java.awt.CardLayout;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JPanel;

import client.console.ClientConsole;

import common.Item;
import common.ItemsParser;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class LiveAuctions extends JPanel {

	
	public static List list = new List();
	public static ArrayList items = new ArrayList();
	/**
	 * Create the panel.
	 */
	public LiveAuctions() {
		setLayout(null);
		
		JButton btnLogOut = new JButton("Log Out");
        btnLogOut.setToolTipText("Click to log out");
        btnLogOut.setBounds(6, 66, 117, 29);
        add(btnLogOut);
        
        JButton btnHome = new JButton("Home");
        btnHome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl = (CardLayout)(AuctionService.panels.getLayout());
			    cl.show(AuctionService.panels, "Main");
        	}
        });
        btnHome.setToolTipText("Click to go back to home view");
        btnHome.setBounds(6, 107, 117, 29);
        add(btnHome);
        
        JButton btnCreateAuction = new JButton("Create Auction");
        btnCreateAuction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "CreateItem");
        	}
        });
        btnCreateAuction.setToolTipText("Click to create your own Auction");
        btnCreateAuction.setBounds(6, 148, 117, 29);
        add(btnCreateAuction);
        
        JButton btnViewBids = new JButton("View Bids");
        btnViewBids.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "ViewBids");
        	}
        });
        btnViewBids.setToolTipText("Click to view current bids");
        btnViewBids.setBounds(6, 189, 117, 29);
        add(btnViewBids);
        
        JButton btnCart = new JButton("Cart");
        btnCart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "Cart");
        	}
        });
        btnCart.setToolTipText("Click to view Auction Items won");
        btnCart.setBounds(6, 230, 117, 29);
        add(btnCart);
        
        
        list.setBounds(229, 66, 326, 193);
        add(list);
        
        JButton btnSelect = new JButton("Select");
        btnSelect.setToolTipText("Press to Enter highlighted Auction");
        btnSelect.setBounds(438, 270, 117, 29);
        add(btnSelect);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setToolTipText("Click to deselect Auction");
        btnCancel.setBounds(239, 270, 117, 29);
        add(btnCancel);


	}
	
	/*public static void setList(ArrayList a1){
		items=a1;
		list.removeAll();
		for(int i=0;i<a1.size();i++){
			Item i1= (Item) a1.get(i);
			list.add(i1.getName());
		}
		
		 AuctionService.chat.received("");
	}*/

}
