package array1;

public class Arr2 {
	//An array in Java without any name is anonymous array.
	//Java Program to demonstrate the way of passing an anonymous array  
	//to method.
	
  static void arraym(int a[]) {
	  for (int i=0;i<a.length;i++)
		  System.out.println(a[i]);
  }
  public static void main(String[] args) {
	  arraym(new int[] {1,2,3,4,5,6,7});
	  
  }
}
