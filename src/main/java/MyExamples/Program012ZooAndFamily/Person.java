package MyExamples.Program012ZooAndFamily;

public class Person extends Animal{
    private String surname;
    protected Person(String name, String yearOfBirn, String surname) {
        super(name, yearOfBirn);
        this.surname = surname;
    }
}
