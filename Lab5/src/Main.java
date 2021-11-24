
public class Main  {
    public static void main(String[] args) {
        Dog doggo = new Dog ("Doggo", 1, 10);
        Cat catto = new Cat("Catto", 2, 20);
        Goldfish goldfisho = new Goldfish("Goldofisho",3,30);
        doggo.makeNoise();
        doggo.stroke();
        catto.makeNoise();
        catto.stroke();
        goldfisho.makeNoise();
        Petshop petshop = new Petshop();
        petshop.createForSale();
        petshop.buyCat();
        petshop.buyDog();
        petshop.buyPetByCost(1.9);
        StrokeATron stroky = new StrokeATron();
        stroky.strokeAll();
    }
}
