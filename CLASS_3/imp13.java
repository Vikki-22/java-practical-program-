import java.util.Scanner;
class imp13 
	{
	public static void main (String args[])
		{
		
		int y,x;
		Scanner src= new Scanner(System.in);
		System.out.println("enter the value of x =");
		x =src.nextInt();	
		System.out.println(" the value of x ="+x);
		y = x++ + ++x;
		System.out.println(" the value of y ="+y);
	
		
}
	}