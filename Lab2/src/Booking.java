import java.time.LocalDate;


public class Booking {
    private LocalDate startDate;
    private int numberOfNights = 0;
    private double costPerNight = 0;


    Booking(LocalDate startDate, int NumberOfNights, double costPerNight) {
        this.startDate = startDate;
        this.numberOfNights = NumberOfNights;
        this.costPerNight = costPerNight;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }


    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "startDate=" + startDate +
                ", numberOfNights=" + numberOfNights +
                ", costPerNight=" + costPerNight +
                '}';
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getCostPerNight() {
        return costPerNight;
    }
    public double getTotalCost() {
        return this.getNumberOfNights()*this.getCostPerNight();
    }
}
