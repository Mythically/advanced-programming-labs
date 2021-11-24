public class OrderTest {
    public static void main(String[] args) {
        Restaurant resto = new Restaurant("resto");
        for (int i = 0; i <= 6; i++)
        try {
            resto.serveCheeseBurger(); //2. What line of code, in which other class, called the serveCheeseBurger() method : here
        } catch (OutOfStockException e) {
            System.out.println(e.getMessage());
        }
    }

}
