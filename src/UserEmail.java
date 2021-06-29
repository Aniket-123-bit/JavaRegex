
public class UserEmail {
	public static void main(String[] args) {
		System.out.println(firstName("Anny"));
		System.out.println(firstName("aniket"));
	    System.out.println(lastName("Kada"));
	    System.out.println(lastName("Raikwar"));
	    
	    email();
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
		String email = "abc.xyz@bl.co.in";
		String regex = "^[a-z]{3}[a-zA-Z0-9+_.-]*@[a-z]{2}[.]{1}[a-z]{2}[.][a-z]*$";
		boolean result = email.matches(regex);
		if(result) {
			System.out.println("Given email-id is valid");
		}else {
			System.out.println("Given email-id is not valid");
		}
	}

}
