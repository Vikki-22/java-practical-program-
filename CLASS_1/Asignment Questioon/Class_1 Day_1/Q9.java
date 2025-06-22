//simple intrest
import java.util.*;
public class Q9
{
    public static void main(String args[]) 
    {
       double p, r, t, si;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        p = s.nextDouble();
        System.out.print("Enter the Rate of interest : ");
        r = s.nextDouble();
        System.out.print("Enter the Time period : ");
        t = s.nextDouble();
   
         si = (r * t * p) / 100;
        System.out.print("The Simple Interest is ="+si);
    }
}