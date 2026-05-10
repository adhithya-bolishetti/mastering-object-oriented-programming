import java.util.Scanner;

public class Solution {

    static class Car {
        String make;
        String model;
        int year;
        double rentalPricePerDay;

        public boolean setCarDetails(String make, String model, int year, double rentalPricePerDay) {
            // Check if make or model are actually empty or just contain the backtick placeholder
            if (make == null || make.trim().isEmpty() || 
                model == null || model.trim().isEmpty() || 
                year < 1886 || rentalPricePerDay <= 0) {
                return false;
            }
            this.make = make;
            this.model = model;
            this.year = year;
            this.rentalPricePerDay = rentalPricePerDay;
            return true;
        }

        public void displayCarDetails() {
            System.out.println("Car: Make: " + make + ", Model: " + model + ", Year: " + year + ", Rental Price Per Day: " + rentalPricePerDay);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Use the backtick (`) or newline as a delimiter
        scanner.useDelimiter("[`\\r\\n]+");

        if (scanner.hasNext()) {
            String make = scanner.next();
            String model = scanner.next();
            
            // Check if we have the next expected types to avoid InputMismatchException
            if (scanner.hasNextInt()) {
                int year = scanner.nextInt();
                if (scanner.hasNextDouble()) {
                    double rentalPricePerDay = scanner.nextDouble();

                    Car car = new Car();
                    if (car.setCarDetails(make, model, year, rentalPricePerDay)) {
                        car.displayCarDetails();
                    } else {
                        System.out.println("Invalid input");
                    }
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("Invalid input");
            }
        }

        scanner.close();
    }
}