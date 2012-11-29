package GUI;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.List;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewBids extends JPanel {

	
	public static List list = new List();
	/**
	 * Create the panel.
	 */
	public ViewBids() {
        setLayout(null);
		
		JButton btnLogOut = new JButton("Log Out");
        btnLogOut.setToolTipText("Click to log out of auction services");
        btnLogOut.setBounds(6, 64, 117, 29);
        add(btnLogOut);
        
        JButton btnHome = new JButton("Home");
        btnHome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "Main");
        	}
        });
        btnHome.setToolTipText("Click to go back to home view");
        btnHome.setBounds(6, 107, 117, 29);
        add(btnHome);
        
        JButton btnViewAuctions = new JButton("View Auctions");
        btnViewAuctions.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "LiveAuctions");
        	}
        });
        btnViewAuctions.setToolTipText("Click to view Auctions currently open for bidding");
        btnViewAuctions.setBounds(6, 144, 117, 29);
        add(btnViewAuctions);
        
        JButton btnCreateAuction = new JButton("Create Auction");
        btnCreateAuction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "CreateItem");
        	}
        });
        btnCreateAuction.setToolTipText("Click to create a New Auction");
        btnCreateAuction.setBounds(6, 185, 117, 29);
        add(btnCreateAuction);
        
        JButton btnCart = new JButton("Cart");
        btnCart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "Cart");
        	}
        });
        btnCart.setToolTipText("Click to view items won that are in your cart");
        btnCart.setBounds(6, 226, 117, 29);
        add(btnCart);
        
        list.setBounds(229, 66, 326, 193);
        add(list);     
        
        JButton btnSelect = new JButton("Select");
        btnSelect.setToolTipText("Press to view highlighted bid");
        btnSelect.setBounds(438, 270, 117, 29);
        add(btnSelect);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setToolTipText("Click to deselect Bid");
        btnCancel.setBounds(239, 270, 117, 29);
        add(btnCancel);
        
        JLabel lblYourBids = new JLabel("Your Bids:");
        lblYourBids.setBounds(352, 18, 85, 16);
        add(lblYourBids);
	}

}
