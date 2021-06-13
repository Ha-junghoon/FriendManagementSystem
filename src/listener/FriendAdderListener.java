package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import exceptions.EmailFormatException;
import friend.Friend;
import friend.FriendInput;
import friend.FriendKind;
import friend.UniversityFriend;
import manager.FriendManager;

public class FriendAdderListener implements ActionListener {
	JTextField fieldID;
	JTextField fieldName;
	JTextField fieldEmail;
	JTextField fieldPhone;

	
	FriendManager friendManager;
	public FriendAdderListener(
			JTextField fieldID, 
			JTextField fieldName, 
			JTextField fieldEmail, 
			JTextField fieldPhone,
			FriendManager friendManager) {
		this.fieldID = fieldID;
		this.fieldName = fieldName;
		this.fieldEmail = fieldEmail;
		this.fieldPhone = fieldPhone;
		this.friendManager = friendManager;

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		FriendInput friend = new UniversityFriend(FriendKind.University);

		try {
			friend.setId(Integer.parseInt(fieldID.getText()));
			friend.setName(fieldName.getName());
			friend.setEmail(fieldEmail.getText());
			friend.setPhone(fieldPhone.getText());
			friendManager.addFriend(friend);
			putObject(friendManager,"friendmanager.ser");
			friend.printInfo();
		} catch (EmailFormatException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	public static void putObject(FriendManager friendManager, String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(friendManager);

			out.close();
			file.close();


		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
