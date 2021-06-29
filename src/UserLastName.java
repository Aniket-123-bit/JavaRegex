
public class UserLastName {
	public static void main(String[] args) {
		System.out.println(firstName("Anny"));
		System.out.println(firstName("aniket"));
	    System.out.println(lastName("Kada"));
	    System.out.println(lastName("Raikwar"));
	}
	
	//Validate first name
	public static  boolean firstName( String firstName ) {
		return firstName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
	
	//validate last name
	public static boolean lastName( String lastName ) {
		return lastName.matches("^[A-Z]{1}[a-z]{2,}$");
	}
}
