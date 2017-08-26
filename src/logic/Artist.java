package logic;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Artist {
// START CODE HERE
	private String name;
	private String email;
	private char gender;
	private Date dob = new Date();
	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	
	public Artist(String name, String email, char gender, Date dob) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.dob = dob;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public char getGender() {
		return this.gender;
	}
	
	public Date getDob() {
		return this.dob;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		String out = "Artist [name="+this.name+", email="+this.email+", gender="+this.gender+", dob="+dateFormat.format(dob)+"]";
		return out;
	}



// END CODE HERE
//Hint:dateFormat.format(.....) to print date in the required format
}