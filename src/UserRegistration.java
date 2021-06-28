/**
 * Valid First Name with first letter starting with capital and has minimum 3 characters in it.
 **/
public class UserRegistration {
	public static void main(String[] args) {
		System.out.println(firstName("Anny"));
		System.out.println(firstName("aniket"));
		
	}
	
	public static boolean firstName( String firstName) {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}

}
