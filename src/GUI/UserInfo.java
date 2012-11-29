package GUI;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import java.awt.List;
import java.awt.Color;

public class UserInfo extends JPanel {
	private static final boolean False = false;
	protected static final boolean True = false;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel lblPleaseCorrectAll;

	/**
	 * Create the panel.
	 */
	public UserInfo() {
		setLayout(null);
		
		
        
        JButton button_1 = new JButton("Cancel");
        button_1.setToolTipText("Click to exit out and cancel the registration process");
        button_1.setBounds(287, 346, 101, 28);
        add(button_1);
        
        JButton button_2 = new JButton("<<Previous");
        button_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl = (CardLayout)(AuctionService.panels.getLayout());
			    cl.show(AuctionService.panels, "UserName");
        	}
        });
        button_2.setToolTipText("Click to go back to the previous page");
        button_2.setBounds(29, 346, 101, 28);
        add(button_2);
        
        final JLabel lblCity_1 = new JLabel("City:");
        lblCity_1.setBounds(420, 227, 35, 16);
        add(lblCity_1);
        lblCity_1.setVisible(False);
        
        final JLabel lblState_1 = new JLabel("State:");
        lblState_1.setBounds(420, 272, 35, 16);
        add(lblState_1);
        lblState_1.setVisible(False);
        
        final JLabel lblZip_1 = new JLabel("ZIP:");
        lblZip_1.setBounds(419, 312, 35, 16);
        add(lblZip_1);
        lblZip_1.setVisible(False);
        
        final JLabel lblAddressLine_2 = new JLabel("Address Line 1:");
        lblAddressLine_2.setBounds(45, 227, 101, 16);
        add(lblAddressLine_2);
        lblAddressLine_2.setVisible(False);
        
        final JLabel lblAddressLine_3 = new JLabel("Address Line 2:");
        lblAddressLine_3.setBounds(45, 272, 101, 16);
        add(lblAddressLine_3);
        lblAddressLine_3.setVisible(False);
        
        final JLabel lblAddressLine_4 = new JLabel("Address Line 3:");
        lblAddressLine_4.setBounds(45, 312, 101, 16);
        add(lblAddressLine_4);
        lblAddressLine_4.setVisible(False);
        
        final JLabel lblBillingAddress = new JLabel("Billing Address:");
        lblBillingAddress.setBounds(45, 199, 122, 16);
        add(lblBillingAddress);
        lblBillingAddress.setVisible(False);
        
       
        final List list_1 = new List();
        list_1.setBounds(467, 272, 134, 20);
        add(list_1);
        list_1.setVisible(False);
        list_1.add("AL");
        list_1.add("AK");
        list_1.add("AZ");
        list_1.add("AR");
        list_1.add("CA");
        list_1.add("CO");
        list_1.add("CT");
        list_1.add("DE");
        list_1.add("DC");
        list_1.add("FL");
        list_1.add("GA");
        list_1.add("HI");
        list_1.add("ID");
        list_1.add("IL");
        list_1.add("IN");
        list_1.add("IA");
        list_1.add("KS");
        list_1.add("KY");
        list_1.add("LA");
        list_1.add("ME");
        list_1.add("MD");
        list_1.add("MA");
        list_1.add("MI");
        list_1.add("MN");
        list_1.add("MS");
        list_1.add("MO");
        list_1.add("MT");
        list_1.add("NE");
        list_1.add("NV");
        list_1.add("NH");
        list_1.add("NJ");
        list_1.add("NM");
        list_1.add("NY");
        list_1.add("NC");
        list_1.add("ND");
        list_1.add("OH");
        list_1.add("OK");
        list_1.add("OR");
        list_1.add("PA");
        list_1.add("RI");
        list_1.add("SC");
        list_1.add("SD");
        list_1.add("TN");
        list_1.add("TX");
        list_1.add("UT");
        list_1.add("VT");
        list_1.add("VA");
        list_1.add("WA");
        list_1.add("WV");
        list_1.add("WI");
        list_1.add("WY");
        
        final JCheckBox chckbxShippingAddressDiffrent = new JCheckBox("Shipping address diffrent from billing address");
        chckbxShippingAddressDiffrent.setBounds(419, 160, 322, 23);
        add(chckbxShippingAddressDiffrent);
        chckbxShippingAddressDiffrent.addActionListener(new ActionListener() {
        
        	public void actionPerformed(ActionEvent evt) {
        		textField_5.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		textField_6.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		textField_7.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		textField_8.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		textField_9.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		
        		lblAddressLine_4.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		lblAddressLine_3.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		lblAddressLine_2.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		lblCity_1.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		lblState_1.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		lblZip_1.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		lblBillingAddress.setVisible(chckbxShippingAddressDiffrent.isSelected());
        		list_1.setVisible(chckbxShippingAddressDiffrent.isSelected());
        				
        	  }
        	});
        
        textField = new JTextField();
        textField.setBounds(158, 37, 134, 28);
        add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setBounds(158, 77, 134, 28);
        add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setBounds(158, 120, 134, 28);
        add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setBounds(467, 37, 134, 28);
        add(textField_3);
        textField_3.setColumns(10);
        
        JLabel lblAddress = new JLabel("Address line 1:");
        lblAddress.setBounds(45, 43, 101, 16);
        add(lblAddress);
        
        JLabel lblAddressLine = new JLabel("Address line 2:");
        lblAddressLine.setBounds(45, 83, 94, 16);
        add(lblAddressLine);
        
        JLabel lblAddressLine_1 = new JLabel("Address Line 3:");
        lblAddressLine_1.setBounds(45, 126, 111, 16);
        add(lblAddressLine_1);
        
        textField_4 = new JTextField();
        textField_4.setBounds(467, 120, 134, 28);
        add(textField_4);
        textField_4.setColumns(10);
        
        
        JLabel lblCity = new JLabel("City:");
        lblCity.setBounds(420, 43, 35, 16);
        add(lblCity);
        
        JLabel lblState = new JLabel("State:");
        lblState.setBounds(420, 83, 41, 16);
        add(lblState);
        
        JLabel lblZip = new JLabel("Zip:");
        lblZip.setBounds(420, 126, 35, 16);
        add(lblZip);
        
        textField_5 = new JTextField();
        textField_5.setBounds(158, 221, 134, 28);
        add(textField_5);
        textField_5.setColumns(10);
        textField_5.setVisible(false);
        
        textField_6 = new JTextField();
        textField_6.setBounds(158, 306, 134, 28);
        add(textField_6);
        textField_6.setColumns(10);
        textField_6.setVisible(false);
        
        textField_7 = new JTextField();
        textField_7.setBounds(158, 266, 134, 28);
        add(textField_7);
        textField_7.setColumns(10);
        textField_7.setVisible(false);
        
        
        
        textField_8 = new JTextField();
        textField_8.setBounds(467, 221, 134, 28);
        add(textField_8);
        textField_8.setColumns(10);
        textField_8.setVisible(false);
        
       
        
        textField_9 = new JTextField();
        textField_9.setBounds(467, 306, 134, 28);
        add(textField_9);
        textField_9.setColumns(10);
        
        JLabel lblShippingAddress = new JLabel("Shipping Address:");
        lblShippingAddress.setBounds(45, 15, 154, 16);
        add(lblShippingAddress);
        
        final List list = new List();
        list.setBounds(467, 77, 134, 23);
        add(list);
        list.add("AL");
        list.add("AK");
        list.add("AZ");
        list.add("AR");
        list.add("CA");
        list.add("CO");
        list.add("CT");
        list.add("DE");
        list.add("DC");
        list.add("FL");
        list.add("GA");
        list.add("HI");
        list.add("ID");
        list.add("IL");
        list.add("IN");
        list.add("IA");
        list.add("KS");
        list.add("KY");
        list.add("LA");
        list.add("ME");
        list.add("MD");
        list.add("MA");
        list.add("MI");
        list.add("MN");
        list.add("MS");
        list.add("MO");
        list.add("MT");
        list.add("NE");
        list.add("NV");
        list.add("NH");
        list.add("NJ");
        list.add("NM");
        list.add("NY");
        list.add("NC");
        list.add("ND");
        list.add("OH");
        list.add("OK");
        list.add("OR");
        list.add("PA");
        list.add("RI");
        list.add("SC");
        list.add("SD");
        list.add("TN");
        list.add("TX");
        list.add("UT");
        list.add("VT");
        list.add("VA");
        list.add("WA");
        list.add("WV");
        list.add("WI");
        list.add("WY");
        
        
        textField_9.setVisible(false);
        
        JButton button = new JButton("Continue>>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AuctionService.sAddress1=textField.getText();
				AuctionService.sAddress2=textField_1.getText();
				AuctionService.sAddress3=textField_2.getText();
				AuctionService.sCity= textField_3.getText();
				AuctionService.sZip=textField_4.getText();
				AuctionService.sState=list.getSelectedItem();
				
				label.setVisible(false);
				label_1.setVisible(false);
				label_2.setVisible(false);
				label_3.setVisible(false);
				label_4.setVisible(false);
				label_5.setVisible(false);
				label_6.setVisible(false);
				label_7.setVisible(false);
				lblPleaseCorrectAll.setVisible(false);
				
				boolean checksAddress= checkAddress(textField.getText());
				boolean checksCity=checkAddress(textField_3.getText());
				boolean checksState=checkState(list);
				boolean checksZip=checkZip(textField_4.getText());
				boolean checkbAddress;
				boolean checkbCity;
				boolean checkbState;
				boolean checkbZip;
				
				
				
				if(chckbxShippingAddressDiffrent.isSelected()){
					AuctionService.bAddress1=textField_5.getText();
					AuctionService.bAddress2=textField_7.getText();
					AuctionService.bAddress3=textField_6.getText();
					AuctionService.bCity= textField_8.getText();
					AuctionService.bZip=textField_9.getText();
					AuctionService.bState=list_1.getSelectedItem();
					checkbAddress=checkAddress(textField_5.getText());
					checkbCity=checkAddress(textField_8.getText());
					checkbState=checkState(list_1);
					checkbZip=checkZip(textField_9.getText());
					
					if(!checksAddress){
						label.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					if(!checksCity){
						label_1.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					if(!checksState){
						label_2.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					if(!checksZip){
						label_3.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					if(!checkbAddress){
						label_4.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					if(!checkbCity){
						label_5.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					if(!checkbState){
						label_6.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					if(!checkbZip){
						label_7.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					if((checksAddress)&&(checksCity)&&(checksState)&&(checksZip)&&(checkbAddress)&&(checkbCity)&&(checkbState)&&(checkbZip)){
						CardLayout cl = (CardLayout)(AuctionService.panels.getLayout());
					    cl.show(AuctionService.panels, "CreditCardInfo");
					}
					
					
				}
				else{
					AuctionService.bAddress1= AuctionService.sAddress1;
					AuctionService.bAddress2= AuctionService.sAddress2;
					AuctionService.bAddress3= AuctionService.sAddress3;
					AuctionService.bCity= AuctionService.sCity;
					AuctionService.bZip= AuctionService.sZip;
					AuctionService.bState= AuctionService.sState;
					
					if(!checksAddress){
						label.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					if(!checksCity){
						label_1.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					if(!checksState){
						label_2.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					if(!checksZip){
						label_3.setVisible(true);
						lblPleaseCorrectAll.setVisible(true);
					}
					
					if((checksAddress)&&(checksCity)&&(checksState)&&(checksZip)){
						CardLayout cl = (CardLayout)(AuctionService.panels.getLayout());
					    cl.show(AuctionService.panels, "CreditCardInfo");
					}
				}
				
			}

			private boolean checkZip(String text) {
				// TODO Auto-generated method stub
				try{
					int number=Integer.parseInt(text);
					if(number<=10000){
						return false;
					}
					if(number>100000){
						return false;
					}
					} 
			 
				catch(NumberFormatException e) {
					return false;
				}
					
				return true;
					
				
			}

			private boolean checkState(List list) {
				// TODO Auto-generated method stub
				if(list.getSelectedItem()==null){
					return false;
				}
				else{
				return true;
				}
			}

			private boolean checkAddress(String text) {
				if(text.equals("")){
					return false;
				}
				else{
				return true;
				}
			}
		});
        button.setToolTipText("Click to continue to your credit card info");
        button.setBounds(527, 346, 101, 28);
        add(button);
        
        lblPleaseCorrectAll = new JLabel("Please correct all *");
        lblPleaseCorrectAll.setToolTipText("Please correct any fields with a * next to it");
        lblPleaseCorrectAll.setForeground(Color.RED);
        lblPleaseCorrectAll.setBounds(168, 164, 134, 16);
        add(lblPleaseCorrectAll);
        lblPleaseCorrectAll.setVisible(false);
        
        label = new JLabel("*");
        label.setForeground(Color.RED);
        label.setToolTipText("Please correct Address line1");
        label.setBounds(300, 43, 61, 16);
        add(label);
        label.setVisible(false);
        
        label_1 = new JLabel("*");
        label_1.setForeground(Color.RED);
        label_1.setToolTipText("Please Enter in City");
        label_1.setBounds(615, 43, 61, 16);
        add(label_1);
        label_1.setVisible(false);
        
        label_2 = new JLabel("*");
        label_2.setToolTipText("Please Select a State");
        label_2.setForeground(Color.RED);
        label_2.setBounds(615, 83, 61, 16);
        add(label_2);
        label_2.setVisible(false);
        
        label_3 = new JLabel("*");
        label_3.setForeground(Color.RED);
        label_3.setToolTipText("Please enter your zip using only numbers");
        label_3.setBounds(613, 126, 61, 16);
        add(label_3);
        label_3.setVisible(false);
        
        label_4 = new JLabel("*");
        label_4.setToolTipText("Please enter in billing address1");
        label_4.setForeground(Color.RED);
        label_4.setBounds(300, 227, 61, 16);
        add(label_4);
        label_4.setVisible(false);
        
        label_5 = new JLabel("*");
        label_5.setToolTipText("Please Enter in billing city");
        label_5.setForeground(Color.RED);
        label_5.setBounds(615, 227, 61, 16);
        add(label_5);
        label_5.setVisible(false);
        
        label_6 = new JLabel("*");
        label_6.setToolTipText("Please select a state");
        label_6.setForeground(Color.RED);
        label_6.setBounds(615, 272, 61, 16);
        add(label_6);
        label_6.setVisible(false);
        
        label_7 = new JLabel("*");
        label_7.setToolTipText("Please enter billing zip using only numbers");
        label_7.setForeground(Color.RED);
        label_7.setBounds(613, 312, 61, 16);
        add(label_7);
        label_7.setVisible(false);
        
        
        
	}
}
