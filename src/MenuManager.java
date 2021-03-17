import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. Add friends");
			System.out.println("2. Delete friends");
			System.out.println("3. Edit friends");
			System.out.println("4. View friends");
			System.out.println("5. Show a menu");
			System.out.println("6. Exit");
			System.out.println("Select on number between 1-6:");
			num = input.nextInt();
			switch(num) {
			case 1:
				System.out.print("Friends number :");
				int friendsNumber = input.nextInt();
				System.out.print("Friends name : ");
				String friendsName = input.next();
				break;
			case 2:
				System.out.print("Friends number: ");
				int friendsNumber2 = input.nextInt();
				input.reset();
				break;
				
			case 3:
				System.out.print("Friends number: " );
				int friendsNumber3 = input.nextInt();
				input.reset();
				int friendsNumber4 = input.nextInt();
				System.out.print("Friends name: " );
				String friendsName2 = input.next();
				input.reset();
				String friendsName3 = input.next();
				
				break;
				
			case 4:
				System.out.print("Friends number:");
				System.out.print("Friends name: ");
				break;
			}
				
		}
	}

}
