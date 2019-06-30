package basic;

import java.util.Scanner;

public class FactorialNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find factorial");
		int n=sc.nextInt();
		int r=1;
		while(n>0)
		{
			r=r*n;
			n--;
		}
		System.out.println("Factorial of given number is "+r);
	}
}
