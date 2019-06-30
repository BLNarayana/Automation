package basic;

import java.util.Scanner;

public class Fibonacci 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range of Fibonacci series");
		int r=sc.nextInt();
		int a=0,b=1,c=a+b;
		System.out.print(a+" "+b);
		while(c<=r)
		{
			System.out.print(" "+c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}
