public class Parrot extends Pet implements Printable{
    private String color;

    public Parrot(String name, Integer age, String color) {
        super(name, age);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName()+
                "\nAge: " + getAge()+
                "\nColor: " + color
        );
    }
}
