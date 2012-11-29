package GUI;

import java.awt.Label;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Processing extends JPanel {

	/**
	 * Create the panel.
	 */
	public Processing() {
		setLayout(null);
		
		JProgressBar progressBar = new JProgressBar();
        progressBar.setToolTipText("Your registration is proccessed when bar is full and auction services will start");
        progressBar.setBounds(64, 254, 230, 20);
        add(progressBar);
        
        Label label = new Label("The System is now Processing");
        label.setBounds(64, 82, 204, 17);
        add(label);
        
        Label label_1 = new Label("your information");
        label_1.setBounds(64, 123, 66, 17);
        add(label_1);
        
        Label label_2 = new Label("please wait\u2026..");
        label_2.setBounds(64, 162, 66, 17);
        add(label_2);

	}

}
