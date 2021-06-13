package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.FriendAdderCancelListener;
import listener.FriendAdderListener;
import manager.FriendManager;

public class FriendAdder extends JPanel{
	WindowFrame frame;
	FriendManager friendManager;	



	public FriendAdder(WindowFrame frame, FriendManager friendManager) {
		this.frame = frame;
		this.friendManager = friendManager;
		
		JPanel panel =new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelID = new JLabel("id: ",JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);


		JLabel labelName = new JLabel("Name: ",JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelEmail = new JLabel("Email: ",JLabel.TRAILING);
		JTextField fieldEmail = new JTextField(10);
		labelEmail.setLabelFor(fieldEmail);
		panel.add(labelEmail);
		panel.add(fieldEmail);
		
		JLabel labelPhone = new JLabel("Phone: ",JLabel.TRAILING);
		JTextField fieldPhone = new JTextField(10);
		labelPhone.setLabelFor(fieldPhone);
		
		JButton saveButton = new JButton("Save");
		saveButton.addActionListener(new FriendAdderListener(fieldID,fieldName,fieldEmail,fieldPhone, friendManager));
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new FriendAdderCancelListener(frame));

		panel.add(labelPhone);
		panel.add(fieldPhone);
		
		panel.add(saveButton);
		panel.add(cancelButton);

		SpringUtilities.makeCompactGrid(panel, 5, 2, 6,6,6,6);

		this.add(panel);
		this.setVisible(true);
	}
}
