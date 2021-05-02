package friend;

import java.util.Scanner;

public class Friend {
	protected FriendKind kind = FriendKind.University;
	protected String name;
	protected int id;
	protected String email;
	protected String phone;

	public Friend() {

	}
	public Friend(FriendKind kind) {
		this.kind = kind;

	}

	public Friend(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public Friend(String name, int id, String email, String phone) {
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
	}
	public Friend(FriendKind kind,String name, int id, String email, String phone) {
		this.kind = kind;	
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
	}
	
	public FriendKind getKind() {
		return kind;
	}

	public void setKind(FriendKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void printinfo(){
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
		System.out.println("kind:"+skind+"name: " + name+ " id: "+ id+ " email: " + email+ " phone : "+ phone);

	}
	public void getUserInput(Scanner input) {
		System.out.print("Friends ID :");
		int id = input.nextInt();
		this.setId(id);
		System.out.print("Friends name :");
		String name = input.next();
		this.setName(name);
		System.out.print("Email address :");
		String email = input.next();
		this.setEmail(email);
		System.out.print("Phone number :");
		String phone = input.next();
		this.setPhone(phone);
	}

}

