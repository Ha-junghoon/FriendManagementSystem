import java.util.Scanner;

public class FriendManager {
	Friend friend;
	Scanner input;
	
	FriendManager(Scanner input) {
		this.input = input;
		
	}
	public void addFriends() {
		friend = new Friend();
		System.out.print("Friends ID :");
		friend.id = input.nextInt();
		System.out.print("Friends name :");
		friend.name = input.next();
		System.out.print("Email address :");
		friend.email = input.next();
		System.out.print("Phone number :");
		friend.phone = input.next();
	}
	public void deleteFriends() {
		System.out.print("Friends ID :");
		int friendId = input.nextInt();
		if(friend == null) {
			System.out.println("the friend has not been registered");

			return;
		}
		if(friend.id == friendId) {
			friend = null;
			System.out.println("the friend is deleted");
		}

	}
	
	public void editFriends() {;
		System.out.print("Friends ID :");
		int friendId = input.nextInt();
		if(friend.id == friendId) {
			System.out.println("the friend to be edited is " + friendId);
		}

	}
	
	public void viewFriends() {
		System.out.print("Friends ID :");
		int friendId = input.nextInt();
		if(friend.id == friendId) {
			friend.printinfo();
			
		}

	}

}


