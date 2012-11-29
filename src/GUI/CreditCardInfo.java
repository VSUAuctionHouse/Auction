package GUI;

import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import Users.GuestUser;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreditCardInfo extends JPanel {
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public CreditCardInfo() {
		setLayout(null);

		
        
        final JRadioButton rdbtnVisa = new JRadioButton("Visa");
        rdbtnVisa.setToolTipText("Click if your card is a visa card");
        rdbtnVisa.setBounds(29, 190, 72, 23);
        add(rdbtnVisa);
        
        final JRadioButton rdbtnMasterCard = new JRadioButton("MasterCard");
        rdbtnMasterCard.setToolTipText("Click if your card is a mastercard");
        rdbtnMasterCard.setBounds(113, 190, 115, 23);
        add(rdbtnMasterCard);
        
        final JRadioButton rdbtnAmericanExpress = new JRadioButton("American Express");
        rdbtnAmericanExpress.setToolTipText("Click if your card is an american express card");
        rdbtnAmericanExpress.setBounds(242, 190, 159, 23);
        add(rdbtnAmericanExpress);
        
        final ButtonGroup group = new ButtonGroup();
        group.add(rdbtnAmericanExpress);
        group.add(rdbtnVisa);
        group.add(rdbtnMasterCard);
        
        textField = new JTextField();
        textField.setToolTipText("Enter your credit card number off the front of your card");
        textField.setBounds(135, 241, 225, 28);
        add(textField);
        textField.setColumns(10);
        
        JLabel lblCardNumber = new JLabel("Card Number:");
        lblCardNumber.setBounds(28, 247, 89, 16);
        add(lblCardNumber);
        
        JLabel lblExperationDate = new JLabel("Expiration date:");
        lblExperationDate.setBounds(29, 275, 115, 16);
        add(lblExperationDate);
        
        textField_1 = new JTextField();
        textField_1.setToolTipText("Enter the experation date found on the front of your credit card");
        textField_1.setBounds(135, 269, 134, 28);
        add(textField_1);
        textField_1.setColumns(10);
        
        final JLabel lblLastName = new JLabel("Last Name:");
        lblLastName.setBounds(29, 146, 72, 16);
        add(lblLastName);
        
        textField_2 = new JTextField();
        textField_2.setBounds(135, 140, 214, 28);
        add(textField_2);
        textField_2.setColumns(10);
        
        final JLabel lblFirstName = new JLabel("First Name:");
        lblFirstName.setBounds(29, 98, 72, 16);
        add(lblFirstName);
        
        textField_3 = new JTextField();
        textField_3.setBounds(135, 92, 214, 28);
        add(textField_3);
        textField_3.setColumns(10);
        
        JLabel lblCreditCardInformation = new JLabel("Credit Card Information");
        lblCreditCardInformation.setBounds(142, 20, 358, 16);
        add(lblCreditCardInformation);
        
        JButton button = new JButton("I Agree");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//getting and setting variables
				AuctionService.fName= textField_3.getText();
				AuctionService.lName= textField_2.getText();
				AuctionService.ccNumber=textField.getText();
				AuctionService.expDate= textField_1.getText();
				
				
				if(rdbtnVisa.isSelected()){
				AuctionService.cardType="visa";
				}
				if(rdbtnMasterCard.isSelected()){
				AuctionService.cardType="Master Card";
				}
				if(rdbtnAmericanExpress.isSelected()){
				AuctionService.cardType="American Express";
				}
				
				//Creating new User
				AuctionService.createUser();
				
				//Sending new user to Server
				AuctionService.chat.createUsr(AuctionService.user);
				
				
				//Showing GUI Main Menu
				CardLayout cl = (CardLayout)(AuctionService.panels.getLayout());
			    cl.show(AuctionService.panels, "Main");
			}
		});
        button.setToolTipText("Click if you agree to the action policys");
        button.setBounds(375, 346, 72, 28);
        add(button);
        
        JButton button_1 = new JButton("Cancel");
        button_1.setToolTipText("Click to exit out and cancel the registration process");
        button_1.setBounds(206, 346, 101, 28);
        add(button_1);
        
        JButton button_2 = new JButton("<<Previous");
        button_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl = (CardLayout)(AuctionService.panels.getLayout());
			    cl.show(AuctionService.panels, "UserInfo");
        	}
        });
        button_2.setToolTipText("Click to go back to the previous page");
        button_2.setBounds(29, 346, 101, 28);
        add(button_2);
	}

}
