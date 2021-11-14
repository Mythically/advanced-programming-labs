import java.util.Scanner;


public class Check {
    public static void main(String[] args) {
        String names = "";
        int age = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Please enter your name ");
            if (scanner.hasNextLine()) {
                names = scanner.nextLine();
            }
            System.out.printf("Please enter your age ");
            if(scanner.hasNextInt()) {
                age = scanner.nextInt();
                break;
            }
       }
        response(check(age), names);

         UnitMark mark1 = new UnitMark(10,10);
        System.out.println(mark1.avg());
        System.out.println(mark1.calculateUnitClassification());
         UnitMark mark2 = new UnitMark(20, 20);
        System.out.println(mark2.avg());
        System.out.println(mark2.calculateUnitClassification());
         UnitMark mark3 = new UnitMark(30, 30);
        System.out.println(mark3.avg());
        System.out.println(mark3.calculateUnitClassification());
         UnitMark mark4 = new UnitMark(40, 40);
        System.out.println(mark4.avg());
        System.out.println(mark4.calculateUnitClassification());

    }


    public static String check(int age) {
                if (25 >= age) {
                    return "young person";
                } else if (age <= 75) {
                    return "adult person";
                } else {
                    return "senior person";
                }

        }


    public static void response(String person, String names){
            System.out.println(names + " you are eligible for " + person + "'s card");
    }
}
