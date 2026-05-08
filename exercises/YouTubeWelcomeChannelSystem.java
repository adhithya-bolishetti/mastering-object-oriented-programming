import java.util.Scanner;

public class Solution {
    
    // Method with no arguments default method
    public static void displayWelcomeMessage() {
        System.out.print("Welcome to the channel: ");
    }
    
    // Method with a name argument message methode
    public static void displayWelcomeMessage(String name1, String name2) {
        System.out.print(name1 + " " + name2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your code here
        String name1 = scanner.next();
        String name2 = scanner.next();

        if(name1.length() < 3 || name2.length() < 3) {
            System.out.print("Invalid input");
            return;
        }

        displayWelcomeMessage();
        displayWelcomeMessage(name1, name2);
        
        scanner.close();
    }
}