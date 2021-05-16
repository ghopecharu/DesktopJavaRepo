package new1;
 import java.util.*;


public class ReadWrite {

	public static void main(String[] args) {
		// Reading and Writing Java object fileds
		
		Scanner t1 =new Scanner(System.in);
		User1 k= new User1();
		
	    System.out.println("Enter the First name of user:");
	    
	    k.setFirstName(t1.nextLine());
	    
	    System.out.println("Enter the Last name of user:");
	    k.setLastName(t1.nextLine());
	    System.out.println("Enter the Age of user:");
	    k.setAge(t1.nextInt());
        
        System.out.println("FirstName"+ "\t"+"LastName"+ "\t" +"Age");
     
       System.out.println(k.getFirstName()+ "  \t"+ k.getLastName() +"  \t " +k.getAge());
	t1.close();
	}
	

}
