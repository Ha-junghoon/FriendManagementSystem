package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.FriendAdder;
import gui.FriendViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {

	WindowFrame frame;
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getFriendadder());
		frame.revalidate();
		frame.repaint();
	}

}
