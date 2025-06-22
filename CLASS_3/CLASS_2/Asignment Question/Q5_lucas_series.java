import java.util.Scanner;
public class Q5_lucas_series {

    public static void main(String[] args) { 
        int n;
        System.out.print("\nenter the number: "); 
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        System.out.print("\n Lucas Series: ");
        
        int n1 = 0, n2 = 1, n3;
           if (n > 1){
               System.out.println("\n2\n1");
               for(int i = 2; i < n; ++i){
                   n3 = n2;
                   n2 += n1;
                   n1 = n3;
                   System.out.println(n2);
               }
           }
           else if (n == 1)
               System.out.println("\n2");
   
           else
               System.out.println("Input a positive number.");
       }
    }
