package friend;

import java.util.Scanner;

public class CircleFriend extends Friend implements FriendInput{
	protected String familyemail;
	protected String familyphone; 

	public CircleFriend(FriendKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		System.out.print("Friends ID :");
		int id = input.nextInt();
		this.setId(id);

		System.out.print("Friends name :");
		String name = input.next();
		this.setName(name);

		char answer = 'x';
		while (answer !='y' && answer !='Y'&& answer !='n'&& answer !='N')
		{
			System.out.println("Do you have an email address? (Y/N)");
			answer = input.next().charAt(0);
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
		answer = 'x';
		while (answer !='y' && answer !='Y'&& answer !='n'&& answer !='N')
		{
			System.out.println("Do you have a family email address? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("family email address:");
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
		answer = 'x';
		while (answer !='y' && answer !='Y'&& answer !='n'&& answer !='N')
		{
			System.out.println("Do you have an Phone? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Phone number :");
				String phone = input.next();
				this.setPhone(phone);
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setPhone("");
				break;
			}
			else {
			}
		}
		answer = 'x';
		while (answer !='y' && answer !='Y'&& answer !='n'&& answer !='N')
		{
			System.out.println("Do you have a family Phone? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("family phone number :");
				String phone = input.next();
				this.setPhone(phone);
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
	
	public void printInfo(){
		String skind = "none";
		switch(this.kind) {
		case University:
			skind = "Univ.";
			break;
		case HighSchool:
			skind = "High.";
			break;
		case Academy:
			skind = "Acad.";
			break;
		case Circle:
			skind = "Cir.";
			break;
		case Office:
			skind = "Off.";
			break;
		default:			
		}
		System.out.println("kind:"+skind+"name: " + name+ " id: "+ id+ "family email: " + email+ "family phone : "+ phone+" email: " + email+ " phone : "+ phone);

	}
}
