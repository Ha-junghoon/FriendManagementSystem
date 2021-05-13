package friend;

import java.util.Scanner;

public class UniversityFriend extends TeenageFriend {

	protected String familyemail;
	protected String familyphone; 

	public UniversityFriend(FriendKind kind) {
		super(kind);
	}
	public void getUserInput(Scanner input) {
		setFriendID(input);
		setFriendName(input);
		setFriendEmailwithYN(input);
		setFamilyEmailwithYN(input);
		setFriendPhonewithYN(input);
		setFamilyPhonewithYN(input);
		
	}


	public void printInfo(){
		String skind = getkindString();
		System.out.println("kind:"+skind+"name: " + name+ " id: "+ id+ "family email: " + email+ "family phone : "+ phone+" email: " + email+ " phone : "+ phone);

	}

}