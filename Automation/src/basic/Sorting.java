package basic;

import java.util.Arrays;
import java.util.Scanner;

public class Sorting 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of digits to sort");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		//Ascending Order
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j=j+1)
			{
				if(a[i]>a[j])
				{
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
		//Descending Order
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j=j+1)
			{
				if(a[i]<a[j])
				{
					int c=a[i];
					a[i]=a[j];
					a[j]=c;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	} 
}
