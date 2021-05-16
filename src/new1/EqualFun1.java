package new1;

public class EqualFun1 {

	public static void main(String[] args) {
		String s1= new String("Hello");
		String s2= new String ("Hello");
		//value stored in both objects are same so equal func return true.
		if (s1.equals(s2)) {
			System.out.println("s1 equals s2");
			
		}
		else {
			System.out.println("s1 doesnot equal s2");
		}
	}

}
