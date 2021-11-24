import java.util.Random;

public class Restaurant {
    String name;
    int stockLevel;
    Random rand = new Random();
    public Restaurant(String name) {
        this.name = name;
        this.stockLevel = rand.nextInt(10);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void stockUp(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    //    public  void serveCheeseBurger() throws OutOfStockException {
//            try {
//                this.stockLevel -= 1;
//                System.out.println("Cheese burgerrrr");
//            } catch (OutOfStockException e)   {
//                throw  (e.OutOfStockException("ex"));
//            }
//
//
//        }
//    }
    public void serveCheeseBurger() throws OutOfStockException {
        if (stockLevel <= 0) { // 1. What line of code, in which class, did execution pause? : here
            throw (new OutOfStockException("No burgerr, chip"));
        } else {
            this.stockLevel--;
            System.out.println("CHEESEBURGURRR");
        }
    }
}
// 3. How many cheeseburgers were placed in stock randomly? 8