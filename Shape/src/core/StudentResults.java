package core;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentResults {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Collecting basic inputs
        System.out.print("Enter an integer: ");
        int intNumber = sc.nextInt();
        System.out.println("You entered: " + intNumber);

        System.out.print("Enter a double: ");
        double doubleNumber = sc.nextDouble();
        System.out.println("You entered: " + doubleNumber);

        System.out.print("Enter a string: ");
        String stringInput = sc.next();
        System.out.println("You entered: " + stringInput);

        System.out.print("Enter a float: ");
        float floatNumber = sc.nextFloat();
        System.out.println("You entered: " + floatNumber);

        // Collecting student data
        System.out.println("\nEnter details for 3 students:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("\nStudent " + i + ":");
            System.out.print("ID: ");
            int id = sc.nextInt();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Mark 1: ");
            double mark1 = sc.nextDouble();

            System.out.print("Mark 2: ");
            double mark2 = sc.nextDouble();

            System.out.print("Mark 3: ");
            double mark3 = sc.nextDouble();

            students.add(new Student(id, name, mark1, mark2, mark3));
        }

        // Displaying results
        System.out.println("\n--- Student Results ---");
        for (Student student : students) {
            double totalMarks = student.getMarks();
            double average = totalMarks / 3;

            System.out.println("Student: " + student.getStudentname() + " | Average: " + average);
            System.out.println("Result: " + (average > 40 ? "Pass" : "Fail"));
            System.out.println("------------------------");
        }

        sc.close();
    }
}