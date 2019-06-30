import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd number : ");
		int b=sc.nextInt();
		System.out.print("Swapping of "+a+" and "+b+" is ");
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a+","+b);
	}
}
