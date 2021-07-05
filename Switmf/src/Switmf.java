/*A Java program to print gender using Switch*/
import java.util.Scanner;
class Switmf 
{
	enum Gender
	{
		M("Male"),F("Female");
		Gender(String s)
		{
		}
	}
	public void enswit()
	{
		Gender gender=Gender.F;
		switch(gender)
		{
		case M:
			System.out.println("Male");
			break;
		case F:
			System.out.println("Female");
			break;
		}
	}
	public static void main(String[] args) 
	{
		Switmf ob=new Switmf();
		ob.enswit();
	}
}