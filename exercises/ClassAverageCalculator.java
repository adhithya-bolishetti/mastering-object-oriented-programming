import java.util.Scanner;

class Student {
    // Write your code here
    public static double calculateAverage(int n, double[] arr) {
        double sum = 0;

        for(int i=0;i<n;i++) {
            sum += arr[i];
        }

        return sum / n;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        double[] arr = new double[n];

        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextDouble();
        }
        
        Student student  = new Student();
        double average = student.calculateAverage(n, arr);

        System.out.printf("%.2f",average);
        scanner.close();
    }
}