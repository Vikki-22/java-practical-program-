import java.util.Scanner;
public class largest_3_using_logical
{
   public static void main(String args[])
   {
      System.out.println("enter the value of a b c");
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();

      if (a>b&& a>c) {
         System.out.println("a is large no");
      } else {
         if(b>c){
            System.out.println("b is large no");
         }
         else
         {
            System.out.println("c is large no");
         }
      }
      
   }
   }
   
    


