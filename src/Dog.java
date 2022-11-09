public class Dog extends Animal{
    private Integer age;

    public Dog(String name, Integer age) {
        super(name);
        this.age = age;
    }
    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");
    }
}
