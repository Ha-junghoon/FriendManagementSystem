import java.util.ArrayList;
import java.util.Scanner;

import friend.Friend;
import friend.HighSchoolFriend;

public class FriendManager {
	ArrayList<Friend> friends = new ArrayList<Friend>();
	Scanner input;

	FriendManager(Scanner input) {
		this.input = input;

	}
	public void addFriend() {
		int kind = 0;
		Friend friend;
		while(kind != 1 && kind !=2) {
			System.out.print("Select Friend Kind\n");
			System.out.print("1 for University\n");
			System.out.print("2 for Highschool\n");
			System.out.print("Select num for Friend Kind between 1 and 2:");
			kind = input.nextInt();
			if (kind == 1) {
				friend = new Friend();
				friend.getUserInput(input);
				friends.add(friend);
				break;
			}

			else if(kind == 2) {
				friend = new HighSchoolFriend();
				friend.getUserInput(input);
				friends.add(friend);
				break;
			}
			else {
				System.out.print("Select num for Friend Kind between 1 and 2:");

			}
		}
		


	}
	public void deleteFriend() {
		System.out.print("Friends ID :");
		int friendId = input.nextInt();
		int index = -1;
		for (int i=0; i<friends.size();i++) {
			if(friends.get(i).getId() == friendId) {
				index = i;
				break;
			}

		}

		if(index >= 0) {
			friends.remove(index);
			System.out.println("the friend "+friendId+"is deleted");

		}
		else {
			System.out.println("the friend has not been registered");

			return;

		}

	}

	public void editFriend() {;
	System.out.print("Friends ID :");
	int friendId = input.nextInt();
	for (int i=0; i<friends.size();i++) {
		Friend friend = friends.get(i);
		if(friend.getId() == friendId) {
			int num = -1;

			while (num != 5) {
				System.out.println("*** Friends Management System Menu ***");
				System.out.println("1. Edit Id");
				System.out.println("2. Edit Name");
				System.out.println("3. Edit Email");
				System.out.println("4. View Phone");;
				System.out.println("5. Exit");
				System.out.println("Select on number between 1-5:");
				num = input.nextInt();
				if (num == 1) {
					System.out.println("Friends ID : ");
					int id = input.nextInt();
					friend.setId(id);
				}
				else if (num == 2) {
					System.out.println("Friends Name : ");
					String name = input.next();	
					friend.setName(name);
				}
				else if (num == 3) {
					System.out.println("Friends Email : ");
					String email = input.next();
					friend.setEmail(email);
				}
				else if (num == 4) {
					System.out.println("Phone Number : ");
					String phone = input.next();	
					friend.setPhone(phone);
				}
				else {
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
			friends.get(i).printinfo();

		}

	}

}


