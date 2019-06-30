
import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String : ");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		char[] revarray= new char[arr.length];
		
		for(int j=0, i=arr.length-1;i>=0;i--,j++)
		{
			revarray[j]=arr[i];
		}
		 String rev=String.valueOf(revarray);
		System.out.println("String Reverse is "+rev);
	}

}



