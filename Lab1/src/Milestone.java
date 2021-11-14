import java.util.Scanner;
import java.time.LocalDate;
public class Milestone {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int dob = 0;
        LocalDate date = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        System.out.println("PLease enter DoB: ");
        if (scanner.hasNextInt()) {
            dob = scanner.nextInt();
        }
        if ((date.getYear() - dob) < 18 ) {
            System.out.println("Your next milestone is 18");
        } else if ((date.getYear() - dob) < 21 ) {
            System.out.println("Your next milestone is 21");
        } else if ((date.getYear() - dob) < 30 ) {
            System.out.println("Your next milestone is 30");
        }

    }
}
