import java.util.Scanner;

class HotelBooking {
    int nights;
    int guests;
    HotelBooking(int nights, int guests) {
        this.nights = nights;
        this.guests = guests;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your code here
        int nights = scanner.nextInt();
        int guests = scanner.nextInt();

        HotelBooking hotel = new HotelBooking(nights, guests);

        if(hotel.nights < 1 || hotel.nights > 25
            || hotel.guests < 1 || hotel.guests > 5) {
                System.out.print("Booking Canceled");
        } else {
            System.out.print("Booking Confirmed");
        }
        scanner.close();
    }
}