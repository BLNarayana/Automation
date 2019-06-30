import java.util.Scanner;

public class Sorting_Integer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd number : ");
		int b=sc.nextInt();
		
		System.out.println("Enter 1 for Ascending\n2 for Descending");
		int n=sc.nextInt();
		System.out.print("Sorting of "+a+" and "+b+" is ");
		if(n==1)
		{
			if(a>b)
				System.out.println(b+","+a);
			else
				System.out.println(a+","+b);
			
		}
		else if(n==2)
		{
			if(a>b)
				System.out.println(a+","+b);
			else
				System.out.println(b+","+a);
			
		}
	}
}
