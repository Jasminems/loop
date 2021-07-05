/*A Java program to print Even numbers from 10 to 100*/
class Eve 
{
	public static void main(String[] args) 
	{
		int i=10;
		System.out.println("The Numbers from 10 to 100:");
		while(i<=100)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("The Even Numbers are:");
		for(i=10;i<=100;i++) 
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}
}
