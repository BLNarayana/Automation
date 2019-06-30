
import java.util.Scanner;

public class Arithmetic_operations {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number : ");
		int a=sc.nextInt();
		
		System.out.println("Enter 2nd number : ");
		int b=sc.nextInt();
		
		System.out.println("Addition is "+(a+b));
		System.out.println("Subtraction is "+(a-b));
		System.out.println("Multiplication is "+(a*b));
		System.out.println("Division is "+(a/b));
		System.out.println("Modulo division is "+(a%b));
	}

}
