package array1;
import java.util.Scanner;
public class pg2 {
	public static void main(String[] args) {
	int n,x,flag=0,loc=0;
	Scanner s1= new Scanner(System.in);
	System.out.print("Enter the no. of elements you want in array: ");
	n=s1.nextInt();
	int a[]=new int[n];
	System.out.println("Enter All the Elements:");
	for(int i=0;i<n;i++)
	{
		a[i]=s1.nextInt();
		System.out.print(+a[i] +",");
	}
	System.out.println("Enter the Elements you want to delete:");
	x=s1.nextInt();
	
	for(int i=0;i<n;i++) {
		
		if (a[i]==x) {
			flag=1;
			loc=i;
			break;	
		}
		else
		{
			flag=0;
		}
	}
		if(flag==1)
		{
			for(int i=loc+1;i<n;i++)
			{
				a[i-1]=a[i];
			}
			System.out.println("After deleting");
			for(int i=0;i<n-2;i++)
			{
				System.out.print(a[i]+",");
			}
			System.out.print(a[n-2]);
		}
		else {
			System.out.println("Elements not found");
		}
	}
	
	}

