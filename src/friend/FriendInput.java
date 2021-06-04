package friend;

import java.util.Scanner;

import exceptions.EmailFormatException;

public interface FriendInput {
	public int getId();
	public void setId(int id);
	public String getName();
	public void setName(String name);
	public String getEmail();
	public void setEmail(String email)throws EmailFormatException ;
	public String getPhone();
	public void setPhone(String phone);
	public void getUserInput(Scanner input);
	public void printInfo();
	public void setFriendID(Scanner input);
	public void setFriendName(Scanner input);
	public void setFriendEmail(Scanner input);
	public void setFriendPhone(Scanner input);
}
