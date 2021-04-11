package friend;

import java.util.Scanner;

public class HighSchoolFriend extends Friend {
	public void getUserInput(Scanner input) {
		System.out.print("Friends ID :");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Friends name :");
		String name = input.next();
		this.setName(name);

		char answer ='x';
		while(answer != 'Y' && answer != 'y' && answer != 'n' && answer == 'N') 
		{
			System.out.print("Do you have an email address? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Email address :");
				String email = input.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'N' || answer =='n') {
				this.setEmail("");
				break;
			}
			else {

			}
		}

		System.out.print("Phone number :");
		String phone = input.next();
		this.setPhone(phone);
	}

}
