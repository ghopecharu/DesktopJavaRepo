package javaBasics;

public class Variable1 {

	public static void main(String[] args) {
		int a=10;
		float f=a;  // Implicite typecasting.
		System.out.println("float value " +f);
		System.out.println("Int Value " +a);
		float b =30.56f;
		int c = (int) b; // Explicite typecasting.
		
		System.out.println("Int Value " +c);
		int d=130;   //Overflow (When we assign value which is out of range of declared datatype of variable).
	    byte e=(byte) d;
		System.out.println("Overflow: " +e);
		byte g=10;
		byte j=20;
		byte sum=(byte) (g+j); //Compile Time Error: because a+b=20 will be int(adding 2 lower type variables.)
		System.out.println("Sum: "+sum);
	}
	

}
