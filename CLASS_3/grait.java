 import java.util.*;
class grait
{
	public static void main (String args[])
	{
		
		  double A,B, C;
	 Scanner scr =new Scanner(System.in);
		 System.out.println(" Enter salery number A=");
		  A=scr.nextDouble();
		 System.out.println(" Enter salery number B=");
	      B=scr.nextDouble();
		 System.out.println(" Enter salery number C=");
		   C=scr.nextDouble();
	   
			   
		 if(A>B && A>C)
		{
			   System.out.println(A+" Is largest number");
			   
		}
		else
		{
			if(B>C)
			{
				 System.out.println(B+"is largest number");
			} 
			else
			{
				 System.out.println(C+" is largest number");
			}
		}
	}
}
 