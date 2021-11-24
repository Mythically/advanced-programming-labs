import java.util.ArrayList;

public class StrokeATron {
    public StrokeATron() {};
    Dog doggo = new Dog ("Doggo", 1, 10);
    Cat catto = new Cat("Catto", 2, 20);
    Goldfish goldfisho = new Goldfish("Goldofisho",3,30);

    ArrayList<Pet> canStroke = new ArrayList<>();
    public void strokeAll() {
        canStroke.add(doggo);
        canStroke.add(catto);
        canStroke.add(goldfisho);
        for (Pet pet : canStroke) {
            if (pet instanceof Strokes) {
                System.out.println(pet.name + " can be stroked :)");
            } else {
                System.out.println(pet.name + " cannot be stroked :(");
            }
        }

    }

}
