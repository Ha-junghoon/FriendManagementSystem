package friend;

import java.io.Serializable;
import java.util.Scanner;

import exceptions.EmailFormatException;

public abstract class  Friend implements FriendInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1684560454828111978L;
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

	public void setEmail(String email) throws EmailFormatException {
		if (!email.contains("@")&& !email.equals("")) {

			throw new EmailFormatException();
		}
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public abstract void printInfo();


	public void setFriendID(Scanner input) {
		System.out.println("Friends ID : ");
		int id = input.nextInt();
		this.setId(id);
	}
	public void setFriendName(Scanner input) {
		System.out.println("Friends Name : ");
		String name = input.next();	
		this.setName(name);
	}
	public void setFriendEmail(Scanner input) {
		String email = "";
		while(!email.contains("@")) {
			System.out.println("Friends Email : ");
			email = input.next();
			try {
				this.setEmail(email);
			} catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the e-mail address that contains @");
			}
		}
	}
	public void setFriendPhone(Scanner input) {
		System.out.println("Phone Number : ");
		String phone = input.next();	
		this.setPhone(phone);
	}
	public String getkindString() {
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
		return skind;
	}


}

