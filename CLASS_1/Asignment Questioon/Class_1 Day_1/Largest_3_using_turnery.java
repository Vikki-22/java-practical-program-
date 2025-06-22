import java.util.Scanner;

public class Largest_3_using_turnery 
{
    public static void main(String args[])
    {
         System.out.println("enter the value of a b c  ");
      Scanner var1 = new Scanner(System.in);
      int a = var1.nextInt();
      int b = var1.nextInt();
      int c = var1.nextInt();
      
      String result = a> b&& a > c  ? "a is big" : (b > c  ? "b is big" :  "c is big");
      System.out.println(result);

    }
}
