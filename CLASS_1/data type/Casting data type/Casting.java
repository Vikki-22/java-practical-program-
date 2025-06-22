

public class Casting {
    public static void main (String args[])
    {
        System.out.println(" Type Casting => one data type value convert into  second data type value is called  type casting.");
        System.out.println("  (1). Widening Casting => converting a smaller type to a large type size.[byte->short->char->int->long->float->double]");
        System.out.println("  (2). Narrowing Casting => converting a large type to a smaller type size. [double->float->long->int->char->short->byte]");
        System.out.println(" ");
        System.out.println(" ");
        // example of  Narrowe type casting
        double b= 2.02; 
        int a;
        a=(int)b;   
        System.out.print(a);
        // example of wide type casting
        System.out.println(" ");
        System.out.print(" ");
        int x=5;
        float y ;
        y=(float)x;
        System.out.print(y);




    }
}
