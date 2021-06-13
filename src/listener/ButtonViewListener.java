package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.FriendViewer;
import gui.WindowFrame;
import manager.FriendManager;

public class ButtonViewListener implements ActionListener {

	WindowFrame frame;
	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FriendViewer friendViewer = frame.getFriendviewer();
		FriendManager friendManager = getObject("friendmanager.ser");
		friendViewer.setFriendManager(friendManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(friendViewer);
		frame.revalidate();
		frame.repaint();
	}
	
	public static FriendManager getObject(String filename) {
		FriendManager friendManager = null;

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			friendManager = (FriendManager)in.readObject();

			in.close();
			file.close();


		} catch (FileNotFoundException e) {
			return friendManager;
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return friendManager;
	}

}
