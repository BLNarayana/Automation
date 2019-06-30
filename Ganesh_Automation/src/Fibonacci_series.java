import java.util.Scanner;

public class Fibonacci_series {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0,b=1,c=0;
	
	System.out.println("Enter a number : ");
	int num=sc.nextInt();
	System.out.print("The fibonacci series is "+a+", "+b);
	for(int cnt=3;cnt<=num;cnt++)
	{
		c=a+b;
		a=b;
		b=c;
		System.out.print(", "+c);
	}
}
}
