import java.util.*;
public class Entry_control_loop {

    public static void main (String args[])

    {
        int i;
        int n;
        System.out.println("enter the value of N(number)");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("table=");
        for( i=0;i<=10;i++)
        {
           
            System.out.println(n*i);
        }
    }
}