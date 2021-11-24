public class Goldfish extends Pet {
    public Goldfish(String name, int age, int cost) {
        super(name, age, cost);
    }
    public void makeNoise() {
        super.makeNoise();
        System.out.println("this is a goldfish");
    }
}
