import java.util.Scanner;

class Student {
    int id;
    int age;
    int grade;

    // Constructor to initialize student details with validation
    Student(int id, int age, int grade) {
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    // Method to print the details of the student
    void printDetails() {
        System.out.println("Student ID: " + id + ", Age: " + age + ", Grade: " + grade);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int id = scanner.nextInt();
        int age = scanner.nextInt();
        int grade = scanner.nextInt();

        if (id <= 0 || age <= 0 || grade <= 0) {
            System.out.println("Invalid input");
        } else {
            Student student = new Student(id, age, grade);

            student.printDetails();
        }

        scanner.close();
    }
}