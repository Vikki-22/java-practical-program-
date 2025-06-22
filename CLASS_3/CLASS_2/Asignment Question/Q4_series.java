import java.util.Scanner;

public class Q4_series 
{
    public static void main(String[] args) 
    {
       
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            int p = 1;
            for (int j = 1; j <= i; j++) {
                p = (j*j);
            }
            sum += p;
        }
        System.out.println("Sum=" + sum);
    
}
        
    
}
    

