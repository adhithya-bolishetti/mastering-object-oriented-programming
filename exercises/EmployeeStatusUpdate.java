import java.util.Scanner;

public class Solution {

    static class Employee {
        String name;
        boolean status;

        Employee(String name) {
            this.name = name;
        }
    }

    // Method to display employee status
    public static void displayStatus(Employee employee) {

        if (employee.status) {
            System.out.print("Employee statuses: Employee " + employee.name + " is currently active.");
        } else {
            System.out.print("Employee statuses: Employee " + employee.name + " is currently inactive.");
        }
    }

    // Method to update employee status
    public static void setStatus(Employee employee, boolean status) {
        employee.status = status;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String empName = scanner.next();
        boolean status = scanner.nextBoolean();

        Employee employee = new Employee(empName);

        setStatus(employee, status);

        displayStatus(employee);

        scanner.close();
    }
}