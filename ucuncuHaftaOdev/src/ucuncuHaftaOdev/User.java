package ucuncuHaftaOdev;

public class User {
	int id;
	String firstName;
	String lastName;
	
	public User(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getId() {
		return id ;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return "Adınız : " + firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return "Soyadınız : " + lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
