package javaBasics;

public class UniaryOperators1 {

	public static void main(String[] args) {
		int x=10;
		int y=x++;
		System.out.println(y--);
		System.out.println(y--);//uniary Operators: 
		System.out.println(x++);
		System.out.println(++x);
		
		int a=20;
		int b=30;
		System.out.println(a++ + ++a); //addition using uniary operators	
		System.out.println(++a + ++a);
		System.out.println(b++ + b++);
		
		int v=-10;
		int z=10;
		System.out.println(~v); //Uniary operators ~ !.
		System.out.println(~z);
		boolean i=true;
		boolean o=false;
		System.out.println(!i);
		System.out.println(!o);
		
		System.out.println("Arithmetic Expression: " + (10*10/5+3-1*4/2));
		
		
	}

}
