package basic;

import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter any String");
		String a=sc.next();
		String b=new StringBuffer(a).reverse().toString();
		
		int count=0;
		
		char c[]=a.toCharArray();
		
		for(int i=0,j=c.length-1;i<=j;i++,j--)
		{
			if(c[i]!=c[j])
			{
				System.out.println("Entered String is not Palindrome");
				System.exit(0);
			}
			else
				count++;
		}
		if((count==c.length/2&&c.length%2==0)||(c.length%2==1&&count==c.length/2+1))
			System.out.println("Entered String is Palindrome");
		
		/*
		if(a.equals(b))
			System.out.println("Entered String is Palindrome");
		else 
			System.out.println("Entered String is not Palindrome");*/
	}
}
