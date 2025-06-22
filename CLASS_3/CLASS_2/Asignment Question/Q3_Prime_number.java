import java.util.*;
public class Q3_Prime_number
{
    public static void main(String[] args) 
    {
           System.out.println("entre the value of number");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            
            if(isPrime(num)) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
     
        public static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
     }
    
