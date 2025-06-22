// Create a class MathOperation containing method ‘multiply’ to calculate
// multiplication of following arguments.
// a. two integers
// b. three float
// c. all elements of array
// d. one double and one integer

// import java.util.Scanner;
// import java.util.Arrays;

public class MathOperation2 {

    // a. Multiply two integers
    void multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication of two integers: " + result);
    }

    // b. Multiply three floats
    void multiply(float a, float b, float c) {
        float result = a * b * c;
        System.out.println("Multiplication of three floats: " + result);
    }

    // c. Multiply all elements of an integer array
    void multiply(int[] arr) {
        int result = 1;
        for (int num : arr) {
            result *= num;
        }
        System.out.println("Multiplication of all array elements: " + result);
    }

    // d. Multiply one double and one integer
    void multiply(double a, int b) {
        double result = a * b;
        System.out.println("Multiplication of double and integer: " + result);
    }

    // Main method to test all overloaded methods
    public static void main(String[] args) {
        MathOperation2 mo = new MathOperation2();

        // a. Multiply two integers
        mo.multiply(5, 4);

        // b. Multiply three floats
        mo.multiply(2.0f, 1.5f, 3.0f);

        // c. Multiply all elements of an array
        int[] array = { 2, 3, 4 };
        mo.multiply(array);

        // d. Multiply one double and one integer
        mo.multiply(3.5, 2);
    }
}
