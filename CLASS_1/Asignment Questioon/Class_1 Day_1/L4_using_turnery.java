import java.util.*;

public class L4_using_turnery 
{
    public static void main(String args[])
        {
            System.out.println("enter the value of a b c d ");
          Scanner var1 = new Scanner(System.in);
          int a = var1.nextInt();
          int b = var1.nextInt();
          int c = var1.nextInt();
          int d= var1.nextInt();
          String result;
          result = (a>b && a>c && a>d) ? "a is big" :(b>c && b>d)  ? "b is big" : ((c> d) ? "c is big" : "d is big");
          
            System.out.println(result);
          
        }
}
