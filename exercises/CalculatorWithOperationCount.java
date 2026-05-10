import java.util.Scanner;

public class Solution {
    
    static int operationCount = 0;

    static int add(int a, int b) {
        operationCount++;
        return a + b;
    }

    static int subtract(int a, int b) {
        operationCount++;
        return a - b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a < -1000000 || a > 1000000 || b < -1000000 || b > 1000000) {
            System.out.println("Invalid input");
        } else {
            int sum = add(a, b);
            int difference = subtract(a, b);

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Operations performed: " + operationCount);
        }

        scanner.close();
    }
}