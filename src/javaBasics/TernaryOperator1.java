package javaBasics;
import java.util.Scanner;

public class TernaryOperator1 {

	public static void main(String[] args) {
		
		// take input from users
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the name of Student: ");
	    String Name=input.nextLine();
	    
	    System.out.print("Enter the CourseName: ");
	    String CourseName=input.nextLine();
	    
	    System.out.print("Enter your marks: ");
	    double marks = input.nextDouble();

	    // ternary operator checks if
	    // marks is greater than 40
	    String result = (marks > 40) ? "pass" : "fail";

	    System.out.println("Name of Student: "+Name);
	    System.out.println("CourseName : "+CourseName);
	    System.out.println("Percentage: "+marks+ "%");
	    System.out.println("Result : You " + result + " the exam.");
	    
	    input.close();

	}

}
