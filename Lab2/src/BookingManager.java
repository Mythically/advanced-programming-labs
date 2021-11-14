import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookingManager {
    private  List<Booking> bookings = new ArrayList<Booking>();

    public BookingManager(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void addBooking(Booking booking) {
        this.bookings.add(booking);
    }
    public int getNumberOfBookings() {
        return bookings.size();
    }
    public double getTotalBookingValue() {
        double totalCost= 0;
        for(Booking booking : bookings){
            totalCost += booking.getTotalCost();
        }
        return totalCost;
    }
    public void clearBookings() {
        bookings.clear();
    }
    public ArrayList<Booking> getAllBookings() {
        return new ArrayList<>(bookings);
    }
    public List<Booking> getAllBookingsInTheMonth(String month) {
        List<Booking> matching = new ArrayList<Booking>();
        LocalDate checkDate;
        for (Booking booking : bookings){
            if (booking.getStartDate().getMonth().toString().equals(month)) {
                checkDate = booking.getStartDate();
                checkDate = checkDate.plusDays(booking.getNumberOfNights());
                if(checkDate.getMonth().toString().equals(booking.getStartDate().getMonth().toString()))
                    if(!(matching.contains(booking))){
                        matching.add(booking);
                    }

            }
        }
        return matching;
    }
}
