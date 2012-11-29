package GUI;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.Pattern;
import java.awt.Color;

public class UserName extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	

	/**
	 * Create the panel.
	 */
	public UserName() {
setLayout(null);
		
		JButton button = new JButton("Continue>>");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				lblNewLabel.setVisible(false);
				lblNewLabel_1.setVisible(false);
				lblNewLabel_2.setVisible(false);
				
				boolean checkfName= checkTextInput(textField.getText());
				boolean checklName= checkTextInput(textField_1.getText());;
				boolean checkmName= checkTextInput(textField_2.getText());;
				
				if(checkfName==true){
				AuctionService.fName=textField.getText();
				}
				else{
					lblNewLabel.setVisible(true);
				}
				
				if(checkmName==true){
				AuctionService.mName=textField_1.getText();
				}
				else{
					lblNewLabel_2.setVisible(true);
				}
				
				if(checklName==true){
				AuctionService.lName=textField_2.getText();
				}
				else{
					lblNewLabel_1.setVisible(true);
				}
				
				if((checkfName==true)&&(checklName==true)&&(checkmName==true)){
				CardLayout cl = (CardLayout)(AuctionService.panels.getLayout());
			    cl.show(AuctionService.panels, "UserInfo");
				}	
			}

			private boolean checkTextInput(String s1) {
				// TODO Auto-generated method stub
				
				if(Pattern.matches("[a-zA-Z]+", s1))
				{
				
				return true;
				}
				else
				{
				
				return false;
				} 
				
			}
		});
		
        button.setToolTipText("Click to continue to your credit card info");
        button.setBounds(527, 346, 101, 28);
        add(button);
        
        JButton button_1 = new JButton("Cancel");
        button_1.setToolTipText("Click to exit out and cancel the registration process");
        button_1.setBounds(287, 346, 101, 28);
        add(button_1);
        
        JButton button_2 = new JButton("<<Previous");
        button_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		CardLayout cl = (CardLayout)(AuctionService.panels.getLayout());
			    cl.show(AuctionService.panels, "Startup");
        	}
        });
       
        button_2.setToolTipText("Click to go back to the previous page");
        button_2.setBounds(29, 346, 101, 28);
        add(button_2);
        
        JLabel lblFirstName = new JLabel("First Name:");
        lblFirstName.setBounds(47, 109, 101, 16);
        add(lblFirstName);
        
        JLabel lblMiddleName = new JLabel("Middle Name:");
        lblMiddleName.setBounds(47, 152, 101, 16);
        add(lblMiddleName);
        
        JLabel lblLastName = new JLabel("Last Name:");
        lblLastName.setBounds(47, 191, 91, 16);
        add(lblLastName);
        
        textField = new JTextField();
        textField.setToolTipText("Enter your first name characters only");
        textField.setBounds(188, 109, 164, 28);
        add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setToolTipText("please enter your middle name characters only");
        textField_1.setBounds(188, 146, 164, 28);
        add(textField_1);
        textField_1.setColumns(10);
        
        textField_2 = new JTextField();
        textField_2.setToolTipText("Please enter your last name characters only");
        textField_2.setBounds(188, 185, 164, 28);
        add(textField_2);
        textField_2.setColumns(10);
        
        JLabel lblUserName = new JLabel("User Name");
        lblUserName.setBounds(241, 22, 126, 16);
        add(lblUserName);
        
        lblNewLabel = new JLabel("**Please enter characters only**");
        lblNewLabel.setToolTipText("Please correct First Name");
        lblNewLabel.setForeground(Color.RED);
        lblNewLabel.setBounds(375, 115, 209, 16);
        add(lblNewLabel);
        lblNewLabel.setVisible(false);
		
        
        lblNewLabel_1 = new JLabel("**Please enter characters only**");
        lblNewLabel_1.setToolTipText("Please correct middle name");
        lblNewLabel_1.setForeground(Color.RED);
        lblNewLabel_1.setBounds(375, 152, 209, 16);
        add(lblNewLabel_1);
        lblNewLabel_1.setVisible(false);
        
        lblNewLabel_2 = new JLabel("**Please enter characters only**");
        lblNewLabel_2.setToolTipText("Please correct last name");
        lblNewLabel_2.setForeground(Color.RED);
        lblNewLabel_2.setBounds(375, 191, 209, 16);
        add(lblNewLabel_2);
        lblNewLabel_2.setVisible(false);
	}
}
