package basic;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any year");
		int y=sc.nextInt();
		boolean flag=true;
		
		if(y%4==0)
		{
			if(y%100==0)
			{
				if(y%400==0)
					flag=true;
				else
					flag=false;
			}
			else
				flag=true;
		}
		else
			flag=false;
		
		if(flag)
		System.out.println("Leap Year");
		else
		System.out.println("Not Leap Year");
		
	}
}
