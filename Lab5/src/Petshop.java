import java.util.ArrayList;
import java.util.Random;
public class Petshop {
    ArrayList<Pet> forSale = new ArrayList<>();
    Random random = new Random();
    public Petshop () {

    }

    public void createForSale() {
        int amount = random.nextInt(15)+1;
        for (int i = 0; i < amount; i++) {

            String name = "";
            int age = random.nextInt(10);
            int cost = random.nextInt(100);
            int choice = random.nextInt(3)+1;
            if(choice == 1) {
                name = "dog";
                forSale.add((new Dog(name+i, age, cost)));
            } else if (choice == 2) {
                name = "cat";
                forSale.add((new Cat(name+i, age, cost)));
            } else {
                name = "goldfish";
                forSale.add((new Goldfish(name+i, age, cost)));
            }
        }
    }
    public void buyCat() {
        String tempName = null;
        for(Pet pet : forSale) {
            if (pet.name.toLowerCase().contains("cat")) {
               tempName = pet.name;


                forSale.remove(pet);
            }  else {
                continue;
            }
            System.out.println(tempName + " has been bought");
            return;
        }
    }
    public void buyDog() {
        String tempName = null;
        for(Pet pet : forSale) {
            if (pet.name.toLowerCase().contains("dog")) {

                tempName = pet.name;

                forSale.remove(pet);
            } else {
                continue;
            }
            System.out.println(tempName + " has been bought");
            return;
        }
    }
    public void buyPetByCost(double cost) {
        double petCost = 0;
        for(Pet pet : forSale) {
            if (pet.cost < cost) {
                if (pet.cost > petCost) {
                    petCost = pet.cost;
                }

                forSale.remove(pet);
                System.out.println(pet.name + " has been bought and it cost: " + petCost);
                return ;
            } else if (pet.cost == cost) {
                System.out.println(pet.name + " has been bought and it cost: " + petCost);
                return;
            }
        }
        System.out.println("No pets in your price range, sorry");
    }

}
