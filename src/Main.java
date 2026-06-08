import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("=== Student Grade System ===");
        
        System.out.print("Enter Student ID: ");
        String id = input.nextLine();
        
        System.out.print("Enter Student Name: ");
        String name = input.nextLine();
        
        System.out.print("Enter Marks: ");
        double marks = input.nextDouble();
        
        // Create Student object
        Student student = new Student(id, name, marks);
        
        // Calculate grade
        String grade = GradeCalculator.calculateGrade(student.getMarks());
        boolean passStatus = GradeCalculator.isPass(student.getMarks());
        
        // Display results
        System.out.println("\n--- Student Report ---");
        System.out.println(student.toString());
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + (passStatus ? "Pass" : "Fail"));
        
        input.close();
    }
}