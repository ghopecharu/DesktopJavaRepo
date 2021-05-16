package methods1;

public class StaticMethPg {
    int rollno;
    String name;
    static String college="MGT";
    static void change() {
    	college="CompIT";
    }
    StaticMethPg(int r,String n){
    	rollno=r;
    	name=n;
    }
    void Display() {
    	System.out.println("Rollno: "+rollno);
    	System.out.println(" Name: "+name );
    	System.out.println("College: "+college);}
	public static void main(String[] args) {
		change();
		StaticMethPg s1=new StaticMethPg(111,"Tina Jog");
		StaticMethPg s2= new StaticMethPg(222,"Mina Goni");
		StaticMethPg s3= new StaticMethPg(333,"John Dmelo");
		s1.Display();
		s2.Display();
		s3.Display();

	}

}
