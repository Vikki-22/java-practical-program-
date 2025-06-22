import java.util.*;

public class Q2_rev_number {
    
  
    public static void main(String[] args)
     {
        int num;
        System.out.println("enter th value of num");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
  
        int reverse = 0;
        while (num != 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        System.out.println(reverse);
    }
    
}
