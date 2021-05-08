import java.util.ArrayList;
import java.util.Scanner;

import friend.AcademyFriend;
import friend.CircleFriend;
import friend.Friend;
import friend.FriendInput;
import friend.FriendKind;
import friend.HighSchoolFriend;
import friend.OfficeFriend;
import friend.UniversityFriend;

public class FriendManager {
	ArrayList<FriendInput> friends = new ArrayList<FriendInput>();
	Scanner input;
	FriendManager(Scanner input) {
		this.input = input;

	}
	public void addFriend() {
		int kind = 0;
		FriendInput friendInput;
		while(kind != 1 && kind !=2 && kind !=3 && kind !=4 && kind !=5) {
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
		FriendInput friendInput = friends.get(i);
		if(friendInput.getId() == friendId) {
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
					friendInput.setId(id);
				}
				else if (num == 2) {
					System.out.println("Friends Name : ");
					String name = input.next();	
					friendInput.setName(name);
				}
				else if (num == 3) {
					System.out.println("Friends Email : ");
					String email = input.next();
					friendInput.setEmail(email);
				}
				else if (num == 4) {
					System.out.println("Phone Number : ");
					String phone = input.next();	
					friendInput.setPhone(phone);
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
			friends.get(i).printInfo();

		}

	}

}


