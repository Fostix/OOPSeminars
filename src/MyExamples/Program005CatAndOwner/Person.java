package MyExamples.Program005CatAndOwner;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void comeCat(Cat cat) {
        System.out.println("Котейка сюды");
        cat.goOwner();
    }

    @Override
    public String toString() {
        return String.format("%s", this.name);
    }
}
