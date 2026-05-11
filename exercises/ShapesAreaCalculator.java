import java.util.Scanner;

class Shape {
    // Write your code for calculating areas here
    public static double calculateAreaOfCircle(int r) {
        return 3.14 * r * r;
    }

    public static int calculateAreaOfRectangle(int l, int w) {
        return l * w;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code here
        int n = scanner.nextInt();
        Shape shape = new Shape();

        if(n == 1) {
            int r = scanner.nextInt();
            if(r < 0 || r > 100) {
                System.out.print("Invalid input");
                return;
            }
            double area = shape.calculateAreaOfCircle(r);
            System.out.print("Area of Circle: " + (int) area);
        } else if(n == 2) {
            int l = scanner.nextInt();
            int w = scanner.nextInt();
            if(l < 0 || l > 100 || w < 0 || w > 100) {
                System.out.print("Invalid input");
                return;
            }
            int area = shape.calculateAreaOfRectangle(l, w);
            System.out.print("Area of Rectangle: " + area);
        } else {
            System.out.print("Invalid input");
        }
        
        scanner.close();
    }
}