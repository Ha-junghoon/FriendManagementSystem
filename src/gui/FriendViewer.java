package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import friend.FriendInput;
import manager.FriendManager;

public class FriendViewer extends JPanel{
	WindowFrame frame;

	FriendManager friendManager;	

	public FriendManager getFriendManager() {
		return friendManager;
	}

	public void setFriendManager(FriendManager friendManager) {
		this.friendManager = friendManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("NameE");
		model.addColumn("Email");
		model.addColumn("Contact Info.");

		for(int i=0; i< friendManager.size(); i++) {
			Vector row = new Vector();
			FriendInput  fi= friendManager.get(i);
			row.add(fi.getId());
			row.add(fi.getName());
			row.add(fi.getEmail());
			row.add(fi.getPhone());
			model.addRow(row);
		}



		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);
	}

	public FriendViewer(WindowFrame frame, 	FriendManager friendManager) {
		this.frame = frame;
		this.friendManager = friendManager;

		System.out.println("***"+ friendManager.size()+"***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Id");
		model.addColumn("NameE");
		model.addColumn("Email");
		model.addColumn("Contact Info.");

		for(int i=0; i< friendManager.size(); i++) {
			Vector row = new Vector();
			FriendInput  fi= friendManager.get(i);
			row.add(fi.getId());
			row.add(fi.getName());
			row.add(fi.getEmail());
			row.add(fi.getPhone());
			model.addRow(row);
		}



		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);

	}

}

