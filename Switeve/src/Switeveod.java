/*A Java program to find Number is odd or even using Switch*/
import java.util.Scanner;
class Switeveod 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the integer:");
		int num=s.nextInt();
		switch(num%2)
		{
		case 0:
			System.out.println(num+ " is an Even Number");
			break;
		case 1:
			System.out.println(num+ " is an Odd Number");

		}
		
	}
}
