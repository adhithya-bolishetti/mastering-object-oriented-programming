import java.util.Scanner;

class Employee1 {
    String name;

    public Employee1(String name) {
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: Employee");
    }
}

class Manager extends Employee1 {
    public Manager(String name) {
        super(name);
    }

    public void displayInfo() {
        System.out.println("Manager Name: " + name);
        System.out.println("Designation: Manager");
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = scanner.next();
        String name2 = scanner.next();

        Employee1 employee = new Employee1(name1);
        Manager manager = new Manager(name2);

        employee.displayInfo();
        manager.displayInfo();

        scanner.close();
    }
}