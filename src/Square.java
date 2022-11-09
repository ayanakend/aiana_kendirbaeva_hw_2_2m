public class Square extends Figure{
    private String name;
    private Integer side;

    public Square(String name, Integer side) {
        super(name);
        this.side = side;
    }

    @Override
    public Integer calculatePerimeter() {
        return side*4;
    }

    @Override
    public void draw() {
        System.out.println("\u25A1");
    }
}
