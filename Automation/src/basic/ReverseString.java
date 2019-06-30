package basic;

import java.util.Scanner;

public class ReverseString
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any string");
		String a=sc.nextLine();
		String b="";
		int i=a.length()-1;
		StringBuilder sb=new StringBuilder(b);
		while(i>=0)
		{
			sb.append(a.charAt(i));
			i--;
		}
		System.out.println(sb);
	}
}
