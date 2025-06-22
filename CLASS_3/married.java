import java.util.*;
class married

{
	public static void main (String args[])
	{
			
		  int age , gender;
		 
	 Scanner scr =new Scanner(System.in);
	
		  System.out.print(" Enter age="+"  ");
		  age=scr.nextInt();
			  System.out.print(" Enter Gender (1 foe male and 0 for female)="+"  ");
		  gender=scr.nextInt(); 
			   
		 if(gender ==1)
		{
			   System.out.println("gender male");
			   
		}
		else if(gender==0)
		{
				 System.out.println("female");
			} 
			
		
			  System.out.println("age is"+"  "+age);
			  
			if(age>=18)
		{
			   System.out.println(" is Eligiable for marrige");
			   
		}
		else
		{
				 System.out.println(" is Not-Eligiable for marrige");
			}
		
		}
	}