package new1;

public class StatVar1 {
	int a=10;
	static int b =20;
	

	public static void main(String[] args) {
		// 
	StatVar1 Var1= new StatVar1();
	
	System.out.println(Var1.a);  //Instance var cannot be used within static method directly within a class also,to use we have to create object.
	System.out.println(b); //static method directly used in static menthods and other methods as well within a class.
	
	Var1.a=200;
	Var1.b=300;
	
	System.out.println(Var1.a);
	System.out.println(Var1.b);
	
	StatVar1 Var2= new StatVar1();
	
	System.out.println(Var2.a);
	System.out.println(Var2.b);
	}

}
