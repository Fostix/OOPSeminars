package MyExamples.Program012ZooAndFamily;

public class Pet extends Animal{
    private String coatColor;
    public Pet(String name, String yearOfBirn, String coatColor) {
        super(name, yearOfBirn);
        this.coatColor = coatColor;
    }

    @Override
    public String toString() {
        return String.format("%s %s", super.toString(),  this.coatColor);
    }
}
