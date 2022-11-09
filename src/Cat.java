public class Cat extends Animal{
    private Integer age;

    public Cat(String name, Integer age) {
        super(name);
        this.age = age;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC08");
    }
}
