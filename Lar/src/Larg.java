/*A Java program to find largest number among 3 numbers*/
import java.util.Scanner;
class Larg 
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		a=s.nextInt();
		System.out.println("Enter the 2nd number:");
		b=s.nextInt();
		System.out.println("Enter the 3rd number:");
		c=s.nextInt();
		if(a>b&&a>c)
		{
			System.out.println("The Largest Number is:"+a);
		}
		else if(b>c)
        {
            System.out.println("The Largest number is:"+b);
        }
        else
        {
            System.out.println("Largest number is:"+c);
        }
}
}