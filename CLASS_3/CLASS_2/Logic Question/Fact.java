import java.util.*;
public class Fact {

    public static void main(String args[])
   {
    int fact=1;
    int n;
    int i;
    System.out.println("enter the value of n");
    Scanner s=new Scanner(System.in);
    n=s.nextInt();

    for(i=1;i<=n;i++)
    {
        fact=fact*i;
    }
    System.out.println("fact= "+fact);
}
}