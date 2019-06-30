

import java.util.Scanner;

public class Pallindrome_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		StringBuffer rev=new StringBuffer(str);
		String temp=rev.reverse().toString();
		
		if(str.equals(temp))
			System.out.println("Pallindrome String");
		
		else
			System.out.println("Not a Pallindrome String");
	}

}


