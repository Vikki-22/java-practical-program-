import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    // Store student names and grades
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<Double> grades = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Main program loop
        do {
            showMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    showReport();
                    break;
                case 3:
                    System.out.println("Thanks for using Student Grade Tracker!");
                    break;
                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }

    // Show menu options
    private static void showMenu() {
        System.out.println("\n📘 === Student Grade Tracker ===");
        System.out.println("1️⃣  Add a Student and Grade");
        System.out.println("2️⃣  Show Summary Report");
        System.out.println("3️⃣  Exit");
    }

    // Add student name and grade
    private static void addStudent(Scanner scanner) {
        System.out.print("👤 Enter student name: ");
        String studentName = scanner.nextLine();

        System.out.print("🎯 Enter grade (0 to 100): ");
        double studentGrade = scanner.nextDouble();

        if (studentGrade < 0 || studentGrade > 100) {
            System.out.println("⚠ Grade must be between 0 and 100.");
            return;
        }

        names.add(studentName);
        grades.add(studentGrade);
        System.out.println("✅ Student added successfully!");
    }

    // Display all students and summary
    private static void showReport() {
        if (names.isEmpty()) {
            System.out.println("📭 No students have been added yet.");
            return;
        }

        System.out.println("\n📊 === Student Grades Report ===");
        double total = 0;
        double highest = -1;
        double lowest = 101;
        String topStudent = "";
        String bottomStudent = "";

        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            double grade = grades.get(i);
            System.out.printf("• %s: %.2f%n", name, grade);

            total += grade;

            if (grade > highest) {
                highest = grade;
                topStudent = name;
            }
            if (grade < lowest) {
                lowest = grade;
                bottomStudent = name;
            }
        }

        double average = total / grades.size();

        System.out.printf("%n📌 Average Grade: %.2f%n", average);
        System.out.printf("🏆 Highest Grade: %.2f (%s)%n", highest, topStudent);
        System.out.printf("🪫 Lowest Grade: %.2f (%s)%n", lowest, bottomStudent);
    }
}