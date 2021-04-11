import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FriendManager friendManager = new FriendManager(input);

		int num = -1;
		
		while (num != 5) {
			System.out.println("*** Friends Management System Menu ***");
			System.out.println("1. Add friend");
			System.out.println("2. Delete friend");
			System.out.println("3. Edit friend");
			System.out.println("4. View friends");;
			System.out.println("5. Exit");
			System.out.println("Select on number between 1-5:");
			num = input.nextInt();
			if (num == 1) {
				friendManager.addFriend();
			}
			else if (num == 2) {
				friendManager.deleteFriend();
			}
			else if (num == 3) {
				friendManager.editFriend();
			}
			else if (num == 4) {
				friendManager.viewFriends();
			}
			else {
				continue;
			}
		}
		
	}
}


