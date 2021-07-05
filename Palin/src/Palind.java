/*A Java program to find a number is Palindrome or not*/
import java.util.Scanner;
class Palind 
{
	public static void main(String[] args) 
	{
			int n;
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the Number:");
			n=s.nextInt();
			int r,sum=0,temp;
			temp=n;
			while(n>0)
			{
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
			if(temp==sum)
				System.out.println("Palindrome Number");
			else
				System.out.println("Not Palindrome Number");
	
}

}
