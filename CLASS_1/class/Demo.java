
public class Demo {
    
    String model;
    int year;

    // Constructor 
    public Demo(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Create a new Car object
        Demo myCar = new Demo("Alto", 2020);

        // Display car information
        myCar.displayInfo();
    }
}
