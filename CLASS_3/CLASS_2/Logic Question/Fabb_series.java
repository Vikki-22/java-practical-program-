import java.util.*;
public class Fabb_series {
    public static void main(String args[])
    {
     int a=-1;
     int b=1;
     int i;
     int n;
     int result;
     System.out.println("enter the value of n");
     Scanner s=new Scanner(System.in);
     n=s.nextInt();
     for(i=1;i<=n;i++)
     {
        result=a+b;
        a=b;
        b=result;
        System.out.print(result);
        System.out.print(" ");
     }
    
}
}
