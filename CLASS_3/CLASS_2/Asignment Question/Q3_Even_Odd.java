import java.util.Scanner;

public class Q3_Even_Odd
 {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = ob.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

}
