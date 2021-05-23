import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		FriendManager friendManager = getObject("studentmanager.ser");
		if(friendManager == null) {
			friendManager = new FriendManager(input);

		}

		selectMenu(input, friendManager);
		putObject(friendManager,"studentmanager.ser");
	}
	public static void selectMenu(Scanner input,FriendManager friendManager) {
		int num = -1;

		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					friendManager.addFriend();
					logger.log("add a Friend");
					break;
				case 2:
					friendManager.deleteFriend();
					logger.log("delete a Friend");
					break;
				case 3:
					friendManager.editFriend();
					logger.log("edit a Friend");
					break;
				case 4:
					friendManager.viewFriends();
					logger.log("view a list of  Friend");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}

		}
	}
	public static void showMenu() {
		System.out.println("*** Friends Management System Menu ***");
		System.out.println("1. Add friend");
		System.out.println("2. Delete friend");
		System.out.println("3. Edit friend");
		System.out.println("4. View friends");;
		System.out.println("5. Exit");
		System.out.println("Select on number between 1-5:");

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


