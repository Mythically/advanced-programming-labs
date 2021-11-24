
public class Cat extends Pet implements Strokes {
    public Cat (String name, int age, int cost) {
        super(name, age, cost);
    }


    @Override
    public void makeNoise() {
        System.out.println("Miaou");
    }
    public void stroke(){
        System.out.println(name+ " walky away");
    }
}
