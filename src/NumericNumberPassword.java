import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class NumericNumberPassword {
	public static void main(String[] args) {
		System.out.println(firstName("Anny"));
		System.out.println(firstName("aniket"));
	    System.out.println(lastName("Kada"));
	    System.out.println(lastName("Raikwar"));
	    
	    email();
	    phoneNumber();
	    password();
	}
	
	//Validate first name
	public static  boolean firstName( String firstName ) {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	
	//validate last name
	public static boolean lastName( String lastName ) {
		return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	
	//validate email 
	public static void email() {
		String email =  "abc.xyz@bl.co.in";
		String regex = "^[a-z]{3}[a-zA-Z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.][a-z]*$";
		boolean result = email.matches(regex);
		if(result) {
			System.out.println("Given email-id is valid");
		}else {
			System.out.println("Given email-id is not valid");
		}
	}
	
	//validate phoneNuber
	
	public static void phoneNumber() {
		String phone =  "91 8756344556";
		String regex = "^[0-9]{2}[\s][0-9]{10}";
		boolean result = phone.matches(regex);
		if(result) {
			System.out.println("Given phoneNumber is valid");
		}else {
			System.out.println("Given phoneNumber is Not valid");
		}
		
	}
	
	//validate password
	
	public static void password() {
		String password = "abCd@123";
		String regex =  "^(?=.*[0-9])(?=[^@#$%^&+=]*[@#$%^&+=][^@#$%^&+=]*$)(?=.*[a-z])(?=.*[A-Z]).{8,}$";
		boolean result = password.matches(regex);
		if(result) {
			System.out.println("Given Password is valid");
			}else {
				System.out.println("Given Password is not valid");
			}
	}
	
	

}
