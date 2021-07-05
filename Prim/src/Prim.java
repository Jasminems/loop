/*A Java program to find prime or not*/
import java.util.Scanner;
class Prim 
{
	public static void main(String[] args) 
	{
			int n;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Number:");
			n=s.nextInt();
			boolean flag=true;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
					flag=false;
			}
			if(flag&&n!=1)
			{
				System.out.println(n+" is a Prime Number");
			}
			else
			{
				System.out.println(n+" is not a Prime Number");
			}
	}
}
