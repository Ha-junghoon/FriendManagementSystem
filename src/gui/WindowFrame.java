package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.FriendManager;

public class WindowFrame extends JFrame{

	FriendManager friendManager;	
	MenuSelection menuselection;
	FriendAdder friendadder;
	FriendViewer friendviewer;

	

	public WindowFrame(FriendManager friendManager) {

		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.friendManager = friendManager;
		menuselection = new MenuSelection(this);
		friendadder = new FriendAdder(this);
		friendviewer = new FriendViewer(this,this.friendManager);
		
		

		this.setupPanel(menuselection);
		
		this.setVisible(true);

	}
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.getContentPane().revalidate();
		this.getContentPane().repaint();
	}
	

	public MenuSelection getMenuselection() {
		return menuselection;
	}
	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}
	public FriendAdder getFriendadder() {
		return friendadder;
	}
	public void setFriendadder(FriendAdder friendadder) {
		this.friendadder = friendadder;
	}
	public FriendViewer getFriendviewer() {
		return friendviewer;
	}
	public void setFriendviewer(FriendViewer friendviewer) {
		this.friendviewer = friendviewer;
	}

}
