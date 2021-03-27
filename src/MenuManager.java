import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);

		while (num != 6) {
			System.out.println("*** Friends Management System Menu ***");
			System.out.println("1. Add friends");
			System.out.println("2. Delete friends");
			System.out.println("3. Edit friends");
			System.out.println("4. View friends");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select on number between 1-6:");
			num = input.nextInt();
			if (num == 1) {
				addFriends();
			}
			else if (num == 2) {
				deleteFriends();
			}
			else if (num == 3) {
				editFriends();
			}
			else if (num == 4) {
				viewFriends();
			}
			else {
				continue;
			}
		}
	}

	public static void addFriends() {
		Scanner input = new Scanner(System.in);
		System.out.print("Friends ID :");
		int FriendsId = input.nextInt();
		System.out.print("Friends name :");
		String FriendsName = input.next();
		System.out.print("Email address :");
		String FriendsEmail = input.next();
		System.out.print("Phone number :");
		String FriendsPhone = input.next();
	}
	public static void deleteFriends() {
		Scanner input = new Scanner(System.in);
		System.out.print("Friends ID :");
		int FriendsId = input.nextInt();

	}
	
	public static void editFriends() {
		Scanner input = new Scanner(System.in);
		System.out.print("Friends ID :");
		int FriendsId = input.nextInt();

	}
	
	public static void viewFriends() {
		Scanner input = new Scanner(System.in);
		System.out.print("Friends ID :");
		int FriendsId = input.nextInt();

	}

}
