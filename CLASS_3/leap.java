import java.util.*;
class leap 
{
	public static void main (String args[])
	{
			
		  double year;
	 Scanner scr =new Scanner(System.in);
		 System.out.println(" Enter year=");
		  year=scr.nextDouble();
	
			   
		 if(((year %100!=0)&&(year %4==0))||(year%400==0))
		{
			   System.out.println("-year Is leap");
			   
		}
		else
		{
				 System.out.println("-year is not leap");
			}
		
		}
	}