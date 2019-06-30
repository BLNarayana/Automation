package basic;

import java.util.Scanner;

public class PalindromeNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any integer");
		int a=sc.nextInt();
		
		int b[]=Integer.toString(a).chars().map(c -> c-'0').toArray();

		if(b.length<=1)
		{
			System.out.println("Entered number is Palindrome");
		}
		else
		{
			for(int i=0,j=b.length-1;i<=j;i++,j--)
			{
				if(b[i]!=b[j])
				{
					System.out.println("Entered number is NOT Palindrome");
					System.exit(0);
				}
			}
			System.out.println("Entered number is Palindrome");
		}
	}
}
