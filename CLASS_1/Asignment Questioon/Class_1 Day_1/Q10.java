//WAP which accept days(670 days) as integer and display total number of years month days in it.
import java.util.*;
public class Q10 
    {
        public static void main(String args[])
         {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter days: ");
            int days = in.nextInt();
            int years = days / 365;
            days = days - (365 * years);
            int months = days / 30;
            int d = days - (months * 30);
            
            System.out.println(years + " Years " + months + " Months " + d + "Days");
     
    }
    
}
