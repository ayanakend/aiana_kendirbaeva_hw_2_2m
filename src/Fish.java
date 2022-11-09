public class Fish extends Pet implements Printable{
    private String species;

    public String getSpecies() {
        return species;
    }

    public Fish(String name, Integer age, String species) {
        super(name, age);
        this.species = species;
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName()+
                "\nAge: " + getAge()+
                "\nSpecies: " + species
        );
    }
}
