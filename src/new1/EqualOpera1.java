package new1;

public class EqualOpera1 {

	public static void main(String[] args) {
		String s1= new String("Hello");
		String s2= new String ("Hello");
		// as memory locations of both objects are different so result is S1!=S1.
		
		if (s1==s2) {
			System.out.println("s1 equals s2");
			
		}
		else {
			System.out.println("s1 doesnot equal s2");
		}
	

	}

}
