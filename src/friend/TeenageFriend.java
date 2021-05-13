package friend;

import java.util.Scanner;

import exceptions.EmailFormatException;

public abstract class TeenageFriend extends Friend {

	public TeenageFriend(FriendKind kind) {
		super(kind);
	}
	@Override
	public abstract void getUserInput(Scanner input);


	@Override
	public void printInfo(){
		String skind = getkindString();
		System.out.println("kind:"+skind+"name: " + name +"email: " + email+ " phone : "+ phone);
	}
	public void setFriendEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer !='y' && answer !='Y'&& answer !='n'&& answer !='N')
		{
			System.out.println("Do you have an email address? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					System.out.print("Email address:");
					String email = input.next();
					this.setEmail(email);
					break;
				}
				else if (answer == 'n' || answer == 'N') {
					this.setEmail("");
					break;
				}
				else {
				}
			}
			catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}
	}
	public void setFamilyEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer !='y' && answer !='Y'&& answer !='n'&& answer !='N')
		{
			System.out.println("Do you have a family email address? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					if (answer == 'y' || answer == 'Y') {
						setFriendEmail(input);
						break;
					}
					else if (answer == 'n' || answer == 'N') {
						this.setEmail("");
						break;
					}
					else {
					}
				}
			}
			catch(EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}
	}
	public void setFriendPhonewithYN(Scanner input) {
		char answer = 'x';
		while (answer !='y' && answer !='Y'&& answer !='n'&& answer !='N')
		{
			System.out.println("Do you have an Phone? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setFriendPhone(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setPhone("");
				break;
			}
			else {
			}
		}
	}
	public void setFamilyPhonewithYN(Scanner input) {
		char answer = 'x';
		while (answer !='y' && answer !='Y'&& answer !='n'&& answer !='N')
		{
			System.out.println("Do you have a family Phone? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				setFriendPhone(input);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setPhone("");
				break;
			}
			else {
			}

		}

	}
}
