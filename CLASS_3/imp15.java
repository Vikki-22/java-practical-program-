import java.util.*;
class imp15 
	{
	public static void main (String args[])
		{
		
		int y,x,z;
		Scanner src = new Scanner(System.in);
		System.out.println("enter the value of x =");
		
		
		x =src.nextInt();
		System.out.println("enter the value of y =");
		y =src.nextInt();	
	
		z =( x & y | (x|y));	
		System.out.println(" the value of x ="+x);
		System.out.println(" the value of y ="+y);
		System.out.println(" the value of z ="+z);
	
		
}
	}