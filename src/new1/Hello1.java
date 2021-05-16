package new1;

public class Hello1 {

	public static void main(String[] args) {
		
		Variables obj= new Variables();
		User2 y=new User2();
		
	System.out.println(obj.c1); //....prints value 20 instead of 100 as .
	System.out.println(y.getUserid());
	y.setUserid(100);
	System.out.println(y.getUserid());
	}

}
