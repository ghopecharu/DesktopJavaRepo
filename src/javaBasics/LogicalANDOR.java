package javaBasics;

public class LogicalANDOR {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		//------------ logical AND--------
		System.out.println(a<b && c>b); //true and true=true
		System.out.println(a<b && a>c); //true and false=false
		System.out.println(a<b&a<c); //true and true=true
		
		//----LOGICAL OR-------
		System.out.println(a<b || a<c); //true or true =true
		System.out.println(a<b || c<a); //true or false=true
		
	}

}
