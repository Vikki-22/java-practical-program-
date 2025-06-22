//program to swap two value without using third variable.
import java.util.*;
public class Q12 {
    public static void main (String args[])
    {
        int a;
        int b;
        System.out.println("enter the value a and b");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("before swaping value of a and b");
        System.out.println("a="+a);
        System.out.println("b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swaping value of a and b");
        System.out.println("a="+a);
        System.out.println("b="+b);

    }
}
