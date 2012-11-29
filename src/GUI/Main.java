package GUI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JPanel {

	/**
	 * Create the panel.
	 */
	public Main() {
		setLayout(null);
		
		JButton btnLogOut = new JButton("Log Out");
        btnLogOut.setToolTipText("Click to log out of auction services");
        btnLogOut.setBounds(6, 64, 117, 29);
        add(btnLogOut);
        
        JButton btnViewAuctions = new JButton("View Auctions");
        btnViewAuctions.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		AuctionService.chat.getList();
        		CardLayout cl = (CardLayout)(AuctionService.panels.getLayout());
			    cl.show(AuctionService.panels, "LiveAuctions");
        	}
        });
        btnViewAuctions.setToolTipText("Click to view Auctions currently open for bidding");
        btnViewAuctions.setBounds(6, 117, 117, 29);
        add(btnViewAuctions);
        
        JButton btnCreateAuction = new JButton("Create Auction");
        btnCreateAuction.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "CreateItem");
        	}
        });
        btnCreateAuction.setToolTipText("Click to create your own auction");
        btnCreateAuction.setBounds(6, 172, 117, 29);
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
        
        JButton btnCart = new JButton("Cart");
        btnCart.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "Cart");
        	}
        });
        btnCart.setToolTipText("Click to view items won that are in your cart");
        btnCart.setBounds(6, 280, 117, 29);
        add(btnCart);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setToolTipText("image borrowed from http://www.las-cruces.org/");
        lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/GUI/auction_zone_sign.jpg")));
        lblNewLabel.setBounds(170, 37, 316, 296);
        add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Image borrowed from http://www.las-cruces.org/");
        lblNewLabel_1.setBounds(170, 334, 316, 16);
        add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Welcome to Auction Services!");
        lblNewLabel_2.setBounds(208, 6, 198, 29);
        add(lblNewLabel_2);
		
	}

}
