package model;
import java.util.Date;
//Type your code here
class User{
	String name;
	String email;
	LocalDate dob;
	String gender;
	User(String name,String email,LocalDate dob,String gender){
		this.name=name;
		this.email=email;
		this.dob=dob;
		this.gender=gender;
	}
}