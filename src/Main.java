public class Main {
    public static String className(){
        return className();
    }
    public static void main(String[] args) {
        Circle circle = new Circle("circle", 5);
        Square square = new Square("square", 10);
        Rectangle rectangle = new Rectangle("rectangle", 3, 5);
        Triangle triangle = new Triangle("triangle", 4, 3, 6);


        Dog dog = new Dog("rex", 14);
        Cat cat = new Cat("marusya", 3);

        Drawable[] drawables = {circle, square, rectangle, triangle, dog, cat};

        for (Drawable drawable : drawables) {
            if (drawable instanceof Figure) {
                System.out.println(((Figure) drawable).calculatePerimeter() + " " + ((Figure) drawable).getName());
                drawable.draw();
            }
            if (drawable instanceof Animal) {
                System.out.println(((Animal) drawable).getName());
                drawable.draw();
            }
        }
        System.out.println("____________________________________________________________________");

        Pet hamster = createObject("hamster");
        Pet parrot = createObject("parrot");
        Pet fishes = createObject("fishes");
        hamster.print();
        parrot.print();
        fishes.print();
    }
    public static Pet createObject(String className) {
        switch (className) {
            case "hamster":
                Hamster hamster = new Hamster("Cherry", 1, "female");
                return hamster;
            case "parrot":
                Parrot parrot = new Parrot("Lemon", 2, "yellow");
                return parrot;
            case "fishes":
                Fish fishes = new Fish("Lily", 4, "angel fish");
                return fishes;
        }
        return null;
    }
}
