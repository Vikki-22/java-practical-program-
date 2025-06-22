//program to reverse the given number
import java.util.*;

public class Q14 {
   

        public static void main(String[] args) {
    
            int num = 12345; // The number to be reversed
            int reversedNum = 0;
            int originalNum = num; // Store the original number for display
    
            System.out.println("Original Number: " + originalNum);
    
            // Loop to reverse the number
            while (num != 0) {
                int digit = num % 10; // Get the last digit
                reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
                num /= 10; // Remove the last digit from the original number
            }
    
            System.out.println("Reversed Number: " + reversedNum);
        }
    }
    
    

