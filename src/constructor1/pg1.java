package constructor1;

/*public class pg1 {
    pg1(){System.out.println("This is default constructor of class");
    
    }
	public static void main(String[] args) {
		
   pg1 p= new pg1();
	}

}*/

public class pg1{
	int id;
	String name;
	//Patamerterized constructor of class
	pg1(int i,String n){
		 id =i;
	    name=n;
	}
	public void display() {
		System.out.println("Id "+id+" Name: "+name);}
	
	public static void main(String[] args) {
		pg1 p1=new pg1(22,"Tina");
		pg1 p2=new pg1(33,"Mina");
		p1.display();
		p2.display();
		
	}
}