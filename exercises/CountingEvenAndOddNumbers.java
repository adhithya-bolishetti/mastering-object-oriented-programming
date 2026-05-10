import java.util.Scanner;

public class Solution {
    // Write variables and methods to process a number and update the count of even and odd numbers
    public static boolean checkEvenOrOdd(int n) {
        if(n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code here
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<n;i++) {
            if(checkEvenOrOdd(arr[i])) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even Numbers Count: " + evenCount + " ");
        System.out.println("Odd Numbers Count: " + oddCount);

        
        scanner.close();
    }
}