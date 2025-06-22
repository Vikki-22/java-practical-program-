import java.util.*;
public class Q1_table {

    public static void main (String args[])

    {
        int i;
        int n;
        System.out.println("enter the value of N(number)");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("table of "+n);
        for( i=1;i<=10;i++)
        {
           
            System.out.println(n +"*"+i +"= "+(n*i));
        }
    }

}