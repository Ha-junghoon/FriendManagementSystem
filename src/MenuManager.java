import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FriendManager friendManager = new FriendManager(input);

		selectMenu(input, friendManager);
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
					break;
				case 2:
					friendManager.deleteFriend();
					break;
				case 3:
					friendManager.editFriend();
					break;
				case 4:
					friendManager.viewFriends();
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
}


