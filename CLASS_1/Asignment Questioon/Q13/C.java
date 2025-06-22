import java.util.*;

public class C {
    public static void main(String args[])
    {
        int x;
    int y;
    System.out.println("enter the value x and y");
    Scanner s=new Scanner(System.in);
    x=s.nextInt();
    y=s.nextInt();
  
   int z=((x & y )|| (x || y));  
    System.out.println("z="+z);
}

}

