package GUI;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Auction extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public Auction() {
		setLayout(null);
		
		JButton btnLogOut = new JButton("Log Out");
        btnLogOut.setToolTipText("Click to log out of auction services");
        btnLogOut.setBounds(6, 64, 117, 29);
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
        
        JButton btnViewAuctions = new JButton("View Auctions");
        btnViewAuctions.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl = (CardLayout)(AuctionService.panels.getLayout());
			    cl.show(AuctionService.panels, "LiveAuctions");
        	}
        });
        btnViewAuctions.setToolTipText("Click to view Auctions currently open for bidding");
        btnViewAuctions.setBounds(6, 144, 117, 29);
        add(btnViewAuctions);
        
        JButton btnCreateAuction = new JButton("Create Auction");
        btnCreateAuction.setToolTipText("Click to create your own auction");
        btnCreateAuction.setBounds(6, 185, 117, 29);
        add(btnCreateAuction);
        
        JButton btnViewBids = new JButton("View Bids");
        btnViewBids.setToolTipText("Click to view you current bids");
        btnViewBids.setBounds(6, 226, 117, 29);
        add(btnViewBids);
        
        JButton btnCart = new JButton("Cart");
        btnCart.setToolTipText("Click to view items won that are in your cart");
        btnCart.setBounds(6, 267, 117, 29);
        add(btnCart);
        
        JLabel lblNewLabel = new JLabel("ITEM");
        lblNewLabel.setBounds(214, 19, 326, 16);
        add(lblNewLabel);
        
        JLabel lblImageNotAvailable = new JLabel("Image Not Available");
        lblImageNotAvailable.setBounds(400, 80, 246, 154);
        add(lblImageNotAvailable);
        
        JTextPane txtpnItemDescription = new JTextPane();
        txtpnItemDescription.setText("Item Description");
        txtpnItemDescription.setBounds(169, 77, 177, 163);
        add(txtpnItemDescription);
        
        JLabel lblCurrentBid = new JLabel("Highest Bid:");
        lblCurrentBid.setBounds(169, 272, 83, 16);
        add(lblCurrentBid);
        
        JLabel lblBid = new JLabel("Bid");
        lblBid.setBounds(250, 272, 61, 16);
        add(lblBid);
        
        JLabel lblPlaceBid = new JLabel("Place Bid:");
        lblPlaceBid.setBounds(400, 272, 61, 16);
        add(lblPlaceBid);
        
        textField = new JTextField();
        textField.setBounds(462, 266, 134, 28);
        add(textField);
        textField.setColumns(10);
        
        JButton btnPlaceBid = new JButton("Place Bid");
        btnPlaceBid.setBounds(472, 306, 117, 29);
        add(btnPlaceBid);
       
       

	}
}
