package MyExamples.Program011GeoTreeTry;

import java.util.ArrayList;

public class Relatives {
    private String relationship;
    private ArrayList<Person> family;
    public Relatives(String relationship, int count) {
        this.relationship = relationship;
        this.family = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            this.family.add(new Person());
        }
    }

    public void append(String relationship, Person ... person) {
        this.relationship = relationship;
        this.family = new ArrayList<>();
        int length = person.length;
        for (int i = 0; i < length; i++) {
            family.add(person[i]);
        }
    }

    @Override
    public String toString() {
        return String.format("\n%s%s", this.relationship, this.family);
    }
}
