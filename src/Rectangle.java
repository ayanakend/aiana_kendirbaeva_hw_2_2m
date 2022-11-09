public class Rectangle extends Figure{
    private String name;
    private Integer sideA;
    private Integer sideB;

    public Rectangle(String name, Integer sideA, Integer sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public Integer calculatePerimeter() {
        return (sideA+sideB)*2;
    }

    @Override
    public void draw() {
        System.out.println("\u25AF");
    }
}
