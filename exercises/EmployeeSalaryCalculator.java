import java.util.Scanner;

class Employee {
    int basicSalary;

    Employee(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    void calculateSalary() {
        System.out.println("Employee Salary: " + basicSalary);
    }
}

// Create Manager class and inherit employee class method
// Note: do not initialize new properties make use of properties from parent class
class Manager extends Employee {

    int bonus;

    Manager(int basicSalary, int bonus) {
        super(basicSalary);
        this.bonus = bonus;
    }

    @Override
    void calculateSalary() {
        System.out.println("Manager Salary: " + (basicSalary + bonus));
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int employeeSalary = scanner.nextInt();
        int managerSalary = scanner.nextInt();
        int managerBonus = scanner.nextInt();

        Employee employee = new Employee(employeeSalary);
        Manager manager = new Manager(managerSalary, managerBonus);

        employee.calculateSalary();
        manager.calculateSalary();

        scanner.close();
    }
}