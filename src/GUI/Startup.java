package GUI;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Startup extends JPanel {

	/**
	 * Create the panel.
	 */
	public Startup() {
		setLayout(null);
		
		JButton btnCancelButton = new JButton("Exit");
		btnCancelButton.setBounds(35, 277, 143, 29);
		btnCancelButton.setToolTipText("Click to Exit");
		add(btnCancelButton);
		
		JButton btnContinue = new JButton("Continue>>");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				CardLayout cl = (CardLayout)(AuctionService.panels.getLayout());
			    cl.show(AuctionService.panels, "UserName");
			}
		});
		btnContinue.setToolTipText("Click to begin registration");
		btnContinue.setBounds(309, 277, 117, 29);
		add(btnContinue);
		
		JLabel lblNewLabel = new JLabel("Welcome to Auction Services");
		lblNewLabel.setBounds(139, 49, 181, 38);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("To Begin Click Start Or");
		lblNewLabel_1.setBounds(139, 85, 181, 16);
		add(lblNewLabel_1);
		
		JLabel lblClickCancelTo = new JLabel("Click Cancel to quit");
		lblClickCancelTo.setBounds(139, 113, 157, 16);
		add(lblClickCancelTo);

	}
}
