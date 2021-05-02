import java.util.ArrayList;
import java.util.Scanner;

import friend.AcademyFriend;
import friend.CircleFriend;
import friend.Friend;
import friend.FriendKind;
import friend.HighSchoolFriend;
import friend.OfficeFriend;
import friend.UniversityFriend;

public class FriendManager {
	ArrayList<Friend> friends = new ArrayList<Friend>();
	Scanner input;
	FriendManager(Scanner input) {
		this.input = input;

	}
	public void addFriend() {
		int kind = 0;
		Friend friend;
		while(kind != 1 && kind !=2 && kind !=3 && kind !=4 && kind !=5) {
			System.out.println("1 for University");
			System.out.println("2 for Highschool");
			System.out.println("3 for Academy");
			System.out.println("4 for Circle");
			System.out.println("5 for Office");
			System.out.println("Select num for Friend Kind between 1,2,3,4,5:");
			kind = input.nextInt();
			if (kind == 1) {
				friend = new UniversityFriend(FriendKind.University);
				friend.getUserInput(input);
				friends.add(friend);
				break;
			}

			else if(kind == 2) {
				friend = new HighSchoolFriend(FriendKind.HighSchool);
				friend.getUserInput(input);
				friends.add(friend);
				break;
			}
			else if(kind == 3) {
				friend = new AcademyFriend(FriendKind.Academy);
				friend.getUserInput(input);
				friends.add(friend);
				break;
			}
			else if(kind == 4) {
				friend = new CircleFriend(FriendKind.Circle);
				friend.getUserInput(input);
				friends.add(friend);
				break;			
			}
			else if(kind == 5) {
				friend = new OfficeFriend(FriendKind.Office);
				friend.getUserInput(input);
				friends.add(friend);
				break;
			}
			else {
				System.out.print("Select num for Friend Kind between 1,2,3,4,5:");
			}
		}
	}
	public void deleteFriend() {
		System.out.print("Friends ID :");
		int friendId = input.nextInt();
		int index = -1;
		for (int i=0; i<friends.size(); i++) {
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


