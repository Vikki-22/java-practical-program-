import java.util.*;
class NLoop 
{
	public static void main(String[] args) 
	{
		int i,j,k,n;
		
		char p;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(k=0;k<n-i;k++)
			{
				System.out.print(" ");
				
			}
			p='A';
			for(j=0;j<=i+i;j++)
			{
				if(j==i)
				{
					p+=32;
				}
				System.out.print(p);
				
				p=(j<i) ?++p : --p ;
				
				
				}
			
			System.out.print("\n");
	}}
}