abstract class Pet  {
    String name;
    int age;
    double cost;
    public Pet (String name, int age, double cost) {
        this.name = name;
        this.age = age;
        this.cost = cost;

    }
    public void makeNoise() {

        System.out.println(name + " makes no noise");
    }

}
