package GUI;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cart extends JPanel {
	
	
	public static List list = new List();
	/**
	 * Create the panel.
	 */
	public Cart() {
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
        btnCreateAuction.setToolTipText("Click to create your own auction");
        btnCreateAuction.setBounds(6, 185, 117, 29);
        add(btnCreateAuction);
        
        JButton btnViewBids = new JButton("View Bids");
        btnViewBids.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "ViewBids");
        	}
        });
        btnViewBids.setToolTipText("Click to view you current bids");
        btnViewBids.setBounds(6, 226, 117, 29);
        add(btnViewBids);
        
        list.setBounds(229, 66, 326, 193);
        add(list);     
        
        JButton btnSelect = new JButton("Select");
        btnSelect.setToolTipText("Press to view highlighted item");
        btnSelect.setBounds(438, 270, 117, 29);
        add(btnSelect);
        
        JButton btnCancel = new JButton("Cancel");
        btnCancel.setToolTipText("Click to deselect Item");
        btnCancel.setBounds(239, 270, 117, 29);
        add(btnCancel);
        
        JLabel lblYourBids = new JLabel("Items Won:");
        lblYourBids.setBounds(352, 18, 85, 16);
        add(lblYourBids);
        
	}

}
