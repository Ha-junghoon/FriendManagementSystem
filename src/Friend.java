
public class Friend {

	String name;
	int id;
	String email;
	String phone;
	
	public Friend() {
		
	}
	
	public Friend(String name, int id) {
		this.name = name;
		this.id = id;
	}
	public Friend(String name, int id, String email, String phone) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.phone = phone;
	}
	
	public void printinfo() {
		System.out.println("name: " + name+ "id: "+ id+ "email: " + email+ "phone : "+ phone);
		
	}

}

