public class Dog extends Pet implements Strokes {
    public Dog (String name, int age, int cost) {
        super(name, age , cost);
    }
    @Override
    public void makeNoise() {
        System.out.println("Baou");
    }
    public void stroke(){
        System.out.println(name+ " waggy tail");
    }
}
