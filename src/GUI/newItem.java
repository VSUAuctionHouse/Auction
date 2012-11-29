package GUI;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import common.Item;

public class newItem extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtEnterTimeIn;

	/**
	 * Create the panel.
	 */
	public newItem() {
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
        btnHome.setBounds(6, 117, 117, 29);
        add(btnHome);
        
        JButton btnViewAuctions = new JButton("View Auctions");
        btnViewAuctions.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "LiveAuctions");
        	}
        });
        btnViewAuctions.setToolTipText("Click to view Auctions currently open for bidding");
        btnViewAuctions.setBounds(6, 172, 117, 29);
        add(btnViewAuctions);
        
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
        
        JLabel lblCreateNewItem = new JLabel("         CREATE NEW ITEM");
        lblCreateNewItem.setForeground(Color.BLACK);
        lblCreateNewItem.setBounds(241, 26, 220, 29);
        add(lblCreateNewItem);
        
        JLabel lblItemName = new JLabel("Item Name: ");
        lblItemName.setBounds(207, 89, 87, 16);
        add(lblItemName);
        
        textField = new JTextField();
        textField.setToolTipText("Enter in an Item Name. Cannot be empty");
        textField.setBounds(291, 83, 201, 28);
        add(textField);
        textField.setColumns(10);
        
        JLabel lblCannotBeEmpty = new JLabel("**Cannot be Empty");
        lblCannotBeEmpty.setForeground(Color.RED);
        lblCannotBeEmpty.setBounds(530, 89, 134, 16);
        add(lblCannotBeEmpty);
        
        JLabel lblItemDiscription = new JLabel("Item Discription:");
        lblItemDiscription.setBounds(172, 134, 106, 16);
        add(lblItemDiscription);
        
        final JTextArea txtrEnter = new JTextArea();
        txtrEnter.setToolTipText("Enter in a Discription of the Item");
        txtrEnter.setText("Discription Goes Here");
        txtrEnter.setBounds(291, 134, 201, 108);
        add(txtrEnter);
        
        JLabel lblPleaseProvide = new JLabel("** Please provide a discription");
        lblPleaseProvide.setForeground(Color.RED);
        lblPleaseProvide.setBounds(530, 144, 189, 16);
        add(lblPleaseProvide);
        
        JLabel lblUploadImage = new JLabel("Upload Image: ");
        lblUploadImage.setBounds(184, 280, 94, 16);
        add(lblUploadImage);
        
        JLabel lblStartingBid = new JLabel("Starting Bid:");
        lblStartingBid.setBounds(202, 308, 76, 16);
        add(lblStartingBid);
        
        JLabel lblReserve = new JLabel("Reserve:");
        lblReserve.setBounds(226, 335, 52, 16);
        add(lblReserve);
        
        textField_1 = new JTextField();
        textField_1.setToolTipText("Enter in a starting bid amount");
        textField_1.setText("0.00");
        textField_1.setBounds(291, 302, 134, 28);
        add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setToolTipText("Enter in the smallest amount you will accept for the time");
        textField_2.setText("0.00");
        textField_2.setBounds(291, 329, 134, 28);
        add(textField_2);
        textField_2.setColumns(10);
        
        JLabel label = new JLabel("");
        label.setForeground(Color.RED);
        label.setBounds(540, 308, 61, 16);
        add(label);
        
        JLabel lblpleaseProvideDollar = new JLabel("**Please provide dollar value");
        lblpleaseProvideDollar.setForeground(Color.RED);
        lblpleaseProvideDollar.setBounds(455, 308, 189, 16);
        add(lblpleaseProvideDollar);
        
        JLabel lblpleaseProvideDollar_1 = new JLabel("**Please provide dollar value");
        lblpleaseProvideDollar_1.setForeground(Color.RED);
        lblpleaseProvideDollar_1.setBounds(455, 335, 189, 16);
        add(lblpleaseProvideDollar_1);
        
        JLabel lblAuctionDuration = new JLabel(" Auction Duration:");
        lblAuctionDuration.setBounds(160, 363, 117, 16);
        add(lblAuctionDuration);
        
        txtEnterTimeIn = new JTextField();
        txtEnterTimeIn.setToolTipText("Enter how long you want the auction to last in minutes");
        txtEnterTimeIn.setText("Time in Minutes");
        txtEnterTimeIn.setBounds(291, 357, 134, 28);
        add(txtEnterTimeIn);
        txtEnterTimeIn.setColumns(10);
        
        JLabel lblpleaseProivdeAuction = new JLabel("**Please proivde Auction time in Minutes");
        lblpleaseProivdeAuction.setForeground(Color.RED);
        lblpleaseProivdeAuction.setBounds(455, 363, 264, 16);
        add(lblpleaseProivdeAuction);
        
        JButton btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		String name= textField.getText();
        		String discription = txtrEnter.getText();
        		double startingBid = Double.parseDouble( textField_1.getText());
        		double reserve = Double.parseDouble(textField_2.getText());
        		
        		Item i1= new Item (name,discription,startingBid, reserve);
        		AuctionService.chat.sendNewItem(i1);
        		System.out.println("Sending Item to server");
        		
        		CardLayout cl= (CardLayout)(AuctionService.panels.getLayout());
        		cl.show(AuctionService.panels, "Main");

        	}
        });
        btnSubmit.setBounds(6, 358, 117, 29);
        add(btnSubmit);
        
        
        

	}
}
