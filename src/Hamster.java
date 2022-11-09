public class Hamster extends Pet implements Printable{
    private String sex;

    public String getSex() {
        return sex;
    }

    public Hamster(String name, Integer age, String sex) {
        super(name, age);
        this.sex = sex;
    }

    @Override
    public void print() {
        System.out.println("Hamster:" +
                "\nName: " + getName()+
                "\nAge: " + getAge()+
                "\nSex: " + sex);
    }
}
