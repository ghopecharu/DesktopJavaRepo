package javaBasics;

import java.util.Scanner;

public class Ternary2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter the name of person: ");
	    String Name=input.nextLine();
	    
	    System.out.print("Enter the place : ");
	    String place =input.nextLine();
	    
	    System.out.print("Enter your age: ");
	    int age = input.nextInt();

	    // ternary operator checks if
	    // marks is greater than 40
	    String result = (age > 18) ? "Eligible" : "Not Eligible";

	    System.out.println("Name : "+Name);
	    System.out.println("Age : "+age+"years");
	    System.out.println("Place : "+place);
	    System.out.println("Corona Vaccination : "+result);

	}

}
