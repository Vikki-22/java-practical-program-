import java.util.*;

public class L4_using_logical 
    {
        public static void main(String args[])
        {
            System.out.println("enter the value of a b c d");
          Scanner var1 = new Scanner(System.in);
          int a = var1.nextInt();
          int b = var1.nextInt();
          int c = var1.nextInt();
          int d = var1.nextInt();

          if (a>b && a>c && a>d) 
          {
            System.out.println("a is large no");
            
          } 
          else { if (b>c && b>d)
             {
                System.out.println("b is large no");
          }
           else { if (c>d) 
            {
                System.out.println("c is large no");
           } 
           else {
            System.out.println("d is large no");
           }
            
          }
        }
    }
            
}
    