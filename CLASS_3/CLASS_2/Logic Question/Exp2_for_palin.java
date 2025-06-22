import java.util.Scanner;
public class Exp2_for_palin {
    public static void main(String args[])
    { int x,rev=0,n;
        System.out.println("enter the value of n");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
         
         
    while(n > 0)
    {
        x = n % 10;
        rev = rev * 10 + x;
        n = n / 10;
        System.out.println(rev);
    }

}
}
