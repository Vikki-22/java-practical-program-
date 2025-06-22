//program to find area and circumference of circle
// area of circle = pi rr
// circumference= 2pi r
import java.util.*;
public class Q7 {
    public static void main(String args[])
    {
     double pi=3.14;
     System.out.println("enter the value of r");
    Scanner sc=new Scanner(System.in);
    double r=sc.nextDouble();
    double area_of_circle=pi*r*r;
    double circumference= 2*pi*r ;
    System.out.println("area_of_circle="+area_of_circle);
    System.out.println("circumference= "+circumference);
}
}