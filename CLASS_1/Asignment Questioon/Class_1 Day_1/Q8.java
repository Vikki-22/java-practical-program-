//program to calculate sum of 5 sub and find percantage
import java.util.*;
public class Q8 {
    public static void main (String args[])
    {
        System.out.println("enter the value of m1 m2 m3 java eds");
      System.out.println("enter the marks out of 100");
      Scanner var = new Scanner(System.in);
      float var1 = var.nextFloat();
      float var2 = var.nextFloat();
      float var3 = var.nextFloat();
      float var4 = var.nextFloat();
      float var5 = var.nextFloat();
      float var7 = var1 + var2 + var3 + var4 + var5;
      float var8 = var7 / 5.0F;
      System.out.println("sum=" + var7);
      System.out.println("percantage=" + var8);
    }
    
}
