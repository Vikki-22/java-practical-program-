import java.util.*;

public class Avarage_percantage_sub5 
{
    public static void main (String args[])
    {
        float sub1,sub2,sub3 ,eds ,java;
        System.out.println("enter the value of m1 m2 m3 java eds");
        System.out.println("enter the marks out of 100");
        Scanner s=new Scanner(System.in);
        sub1=s.nextFloat();
        sub2=s.nextFloat();
        sub3=s.nextFloat();
        eds=s.nextFloat();
        java=s.nextFloat();
        float sum= sub1+sub2+sub3+eds+java;
        float percantage=sum/5;
        System.out.println("sum="+sum);
        System.out.println("percantage="+percantage);
       
        

    }
}
