

import java.util.Scanner;

public class Pallindrome_integer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int a=sc.nextInt();
		int temp=0,d=0,sum=0;
		temp=a;
		while(temp!=0)
		{
			d=temp%10;
			sum=sum*10+d;
			temp/=10;
		}
		
		if(sum==a)
			System.out.println("Pallindrome integer");
		
		else
			System.out.println("Not a Pallindrome integer");
	}

}

