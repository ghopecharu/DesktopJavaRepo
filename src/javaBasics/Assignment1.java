package javaBasics;

public class Assignment1 {

	public static void main(String[] args) {
		
		//assignment operator operations
		int a=10;
		a+=3;
		System.out.println(a);//a+3=13
		a-=4;
		System.out.println(a);//a-4=13-4=9
        a*=2;
        System.out.println(a);//a*2=9*2=18
        a/=2;
        System.out.println(a);//a/2=18/2=9
       //===Adding Short===
        short b=10;
        short c=20;
        // b+=c; works as expected but b=b+c throws error; as b+c=int result
        b=(short)(b+c); //after type caste.
        System.out.println(b);
	}

}
