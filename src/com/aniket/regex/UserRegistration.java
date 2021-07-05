package com.aniket.regex;
import java.util.Scanner;
import java.util.regex.*;

public class UserRegistration {
    private boolean check;
    private String first;
    private static  Scanner SCANNER  = new Scanner(System.in);


    public void checkFirstName() {
        System.out.println("Enter First-name starts with capital letter and has minimum 3 character : ");
        first = SCANNER.nextLine();
        check = Pattern.compile("[A-Z]{1}[a-z]{2,} [A-Z]{1}[a-z]{2,}").matcher(first).matches();
        if (!check) {
            System.out.println("Invalid!!A");
            checkFirstName();
        }
        else {
            System.out.println(" It's a Valid Firstname ");
        }
    }


    public static void main(String[]args) {
        UserRegistration user = new UserRegistration();
        user.checkFirstName();

    }
}

