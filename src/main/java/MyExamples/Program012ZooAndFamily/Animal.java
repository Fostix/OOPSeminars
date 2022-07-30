package MyExamples.Program012ZooAndFamily;

public abstract class Animal {
    private String name;
    private String yearOfBirn;


    protected Animal(String name, String yearOfBirn) {
        this.name = name;
        this.yearOfBirn = yearOfBirn;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.yearOfBirn);
    }
}
