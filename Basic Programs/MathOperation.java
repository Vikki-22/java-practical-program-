import java.util.Scanner;

public class MathOperation {
    double X, Y, R;

    // Method to input X and Y from the user
    void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for X: ");
        X = sc.nextDouble();
        System.out.print("Enter value for Y: ");
        Y = sc.nextDouble();
    }

    // Method to add X and Y
    void add() {
        R = X + Y;
    }

    // Method to multiply X and Y
    void multiply() {
        R = X * Y;
    }

    // Method to calculate X to the power Y
    void power() {
        R = Math.pow(X, Y);
    }

    // Method to display result R
    void display() {
        System.out.println("Result (R) = " + R);
    }

    // Main method to run the program
    public static void main(String[] args) {
        MathOperation mo = new MathOperation();
        mo.init(); // Input values
        mo.add(); // Perform addition
        mo.display(); // Display result

        mo.multiply(); // Perform multiplication
        mo.display(); // Display result

        mo.power(); // Perform power operation
        mo.display(); // Display result
    }
}
