package friend;

import java.util.Scanner;

public interface FriendInput {
	public int getId();
	public void setId(int id);
	public void setName(String name);
	public void setEmail(String email);
	public void setPhone(String phone);
	public void getUserInput(Scanner input);
	public void printInfo();

}
