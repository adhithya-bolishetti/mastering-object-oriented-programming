import java.util.Scanner;

public class Solution {
    
    // write Method to calculate the area of a rectangle here
    public static int calculateArea(int length, int width) {
        return length * width;
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // write your code here   
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        if(length < 0 || width < 0) {
            System.out.print("Invalid input");
            return;
        }

        int result = calculateArea(length, width);

        System.out.print(result);     
        
        scanner.close();
    }
}