/*A Java program to print odd and even numbers*/
import java.util.Scanner;
class Evod
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the Number of values:");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		System.out.println("Enter the values:");
		for(int i=1;i<=num;i++)
		{
			int n=input.nextInt();
		}
		System.out.println("Odd Numbers are:");
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
			
		}
		System.out.println("Even Numbers are:");
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}