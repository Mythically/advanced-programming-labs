import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingTester {
    public static void main(String[] args) {
        ArrayList<Booking> bookings = new ArrayList<>();

        LocalDate date = LocalDate.now();

        BookingManager booker = new BookingManager(bookings);

        booker.addBooking(new Booking(date, 10, 10.9));

        booker.addBooking(new Booking(date, 2, 15));

        System.out.println(booker.getAllBookings());
    }
}
