import java.util.Scanner;

public class Solution {
    
    // Write your recursive factorial calculation method here
    public static int calculateFactorial(int n) {
        if(n <= 1) return 1;

        return n * calculateFactorial(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code here
        int n = scanner.nextInt();

        if(n < 0 || n > 12) {
            System.out.print("Invalid input");
            return;
        }

        int result = calculateFactorial(n);
        System.out.print(result);
        
        scanner.close();
    }
}