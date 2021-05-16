package javaBasics;

public class ShiftOperators1 {

	public static void main(String[] args) {
		
	
		System.out.println(10<<2); //10*2^2=10*4=40 (Left Operator example).  
		System.out.println(10<<3); //10*2^3=10*8=80
		
		System.out.println(10>>2);//10/2^2=10/4=2  (Right Shift operator)
		System.out.println(20>>2);//20/2^2=20/4=5  
		
		 //For positive number, >> and >>> works same  
	    System.out.println(20>>3);  
	    System.out.println(20>>>3);
	    
	    //For negative number, >>> changes parity bit (MSB) to 0 
	    
	    System.out.println(-20>>2);  
	    System.out.println(-20>>>2);  
	}

}
