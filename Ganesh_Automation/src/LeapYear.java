import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a year: ");
	int year=sc.nextInt();
	boolean flag=false;
	if(year%100==0)
	{
		if(year%400==0)
			flag=true;
		else
			flag=false;
	}
	else if(year%4==0)
	{
		flag=true;
	}
	else
		flag=false;
	
	if(flag==true)
		System.out.println("Leap Year");
	else
		System.out.println("Not a Leap Year");
}
}
