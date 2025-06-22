
// 30. Create a class to calculate Area of circle with one data member to store the radius and another to store area value. 
// Create method members 
// 1. init - to input radius from user 
// 2. calc - to calculate area 
// 3. display- to display area 
import java.util.Scanner;

class Circle {
    double radius;
    double area;

    // Method to input radius from the user
    void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextDouble();
    }

    // Method to calculate the area
    void calc() {
        area = Math.PI * radius * radius;
    }

    // Method to display the area
    void display() {
        System.out.printf("The area of the circle is: %.2f\n", area);
    }
}

public class CircleArea {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.init(); // Input radius
        c.calc(); // Calculate area
        c.display(); // Display result
    }
}
