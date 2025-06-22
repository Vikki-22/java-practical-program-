import java.util.Scanner;
class NLoop2
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
				if (i<n-1)
				{
					System.out.print('A');
				}
				
				p=(j<i) ?++p : --p ;
					
				System.out.print(p);
				
				}
			
			System.out.print("\n");
	
}
	}
}