package basic;

import java.util.Scanner;

public class Swapping
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter two digits to swap");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		b=b+a;
		a=b-a;
		b=b-a;
		System.out.println("Swaped Digits are: "+a+" "+b);
		
		/*c=a;
		a=b;
		b=c;
		System.out.println("Swaped Digits are: "+a+" "+b);*/
	}
}
