import java.util.*;

public class bitwise{
    public static void main(String args [])
    {
    System.out.println("enter the value of x,y and z ");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    System.out.println("bitwise operator example:-");
    int a=(x<<3);
    int b=(y>>2);
    int c=(z>>>2);
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    }

    
}
