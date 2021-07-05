/*A Java program to find Armstrong Number or not*/
import java.util.Scanner;
class Armsno 
{
	public static void main(String[] args) 
	{
		int n,sum=0,temp,a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=s.nextInt();
		temp=n;
			while(temp!=0)
			{
				a=temp%10;
				temp=temp/10;
				sum=sum+(a*a*a);
			}
			if(sum==n)
				System.out.println(n +" is an amstrong number");
			else
				System.out.println(n +" is not an armstrong number");
	}
}

