/*A Java program to multiple if else statement*/
class Mlarifelse 
{
	public static void main(String[] args) 
	{
		int a=10,b=20,c=30;
		int max=0;
		if(a>b&&a>c)
			max=a;
		else if(b>c)
			max=b;
		else
			max=c;
		System.out.println("The Larger Number is:"+max);
	}
}
