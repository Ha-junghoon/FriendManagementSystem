package manager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import friend.AcademyFriend;
import friend.CircleFriend;
import friend.Friend;
import friend.FriendInput;
import friend.FriendKind;
import friend.HighSchoolFriend;
import friend.OfficeFriend;
import friend.UniversityFriend;

public class FriendManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 853923515474595371L;
	
	ArrayList<FriendInput> friends = new ArrayList<FriendInput>();
	transient Scanner input;
	FriendManager(Scanner input) {
		this.input = input;

	}
	public void setScanner(Scanner input) {
		this.input = input;
	}
	public void addFriend(String id,String name, String email, String phone) {
		FriendInput friendInput = new UniversityFriend(FriendKind.University);
		friendInput.getUserInput(input);
		friends.add(friendInput);
	}
	public void addFriend(FriendInput friendInput) {
		friends.add(friendInput);
	}
	public void addFriend() {
		int kind = 0;
		FriendInput friendInput;
		while(kind < 1 || kind > 5) {
			try {
				System.out.println("1 for University");
				System.out.println("2 for Highschool");
				System.out.println("3 for Academy");
				System.out.println("4 for Circle");
				System.out.println("5 for Office");
				System.out.println("Select num for Friend Kind between 1,2,3,4,5:");
				kind = input.nextInt();
				if (kind == 1) {
					friendInput = new UniversityFriend(FriendKind.University);
					friendInput.getUserInput(input);
					friends.add(friendInput);
					break;
				}

				else if(kind == 2) {
					friendInput = new HighSchoolFriend(FriendKind.HighSchool);
					friendInput.getUserInput(input);
					friends.add(friendInput);
					break;
				}
				else if(kind == 3) {
					friendInput = new AcademyFriend(FriendKind.Academy);
					friendInput.getUserInput(input);
					friends.add(friendInput);
					break;
				}
				else if(kind == 4) {
					friendInput = new CircleFriend(FriendKind.Circle);
					friendInput.getUserInput(input);
					friends.add(friendInput);
					break;			
				}
				else if(kind == 5) {
					friendInput = new OfficeFriend(FriendKind.Office);
					friendInput.getUserInput(input);
					friends.add(friendInput);
					break;
				}
				else {
					System.out.print("Select num for Friend Kind between 1,2,3,4,5:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	public void deleteFriend() {
		System.out.print("Friends ID :");
		int friendId = input.nextInt();
		int index = findIndex(friendId);
		removefromFriend(index,friendId);
	}
	public int findIndex(int friendId) {
		int index = -1;
		for (int i=0; i<friends.size(); i++) {
			if(friends.get(i).getId() == friendId) {
				index = i;
				break;
			}
		}
		return index;
	}
	public int removefromFriend(int index, int friendId) {
		if(index >= 0) {
			friends.remove(index);
			System.out.println("the friend "+friendId+"is deleted");
			return 1;
		}
		else {
			System.out.println("the friend has not been registered");
			return -1;
		}
	}

	public void editFriend() {;
	System.out.print("Friends ID :");
	int friendId = input.nextInt();
	for (int i=0; i<friends.size();i++) {
		FriendInput friend = friends.get(i);
		if(friend.getId() == friendId) {
			int num = -1;

			while (num != 5) {
				showEditMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					friend.setFriendID(input);
					break;
				case 2:
					friend.setFriendName(input);
					break;
				case 3:
					friend.setFriendEmail(input);
					break;
				case 4:
					friend.setFriendPhone(input);
					break;
				default:
					continue;
				}//if
			}//while
			break;
		}//if
	}//for
	}

	public void viewFriends() {
		//		System.out.print("Friends ID :");
		//		int friendId = input.nextInt();
		for (int i=0; i<friends.size();i++) {
			friends.get(i).printInfo();

		}

	}
	
	public int size() {
		return friends.size();
	}

	public FriendInput get(int index) {
		return (Friend) friends.get(index);
	}
	public void showEditMenu() {
		System.out.println("*** Friends Management System Menu ***");
		System.out.println("1. Edit Id");
		System.out.println("2. Edit Name");
		System.out.println("3. Edit Email");
		System.out.println("4. View Phone");;
		System.out.println("5. Exit");
		System.out.println("Select on number between 1-5:");
	}



}


