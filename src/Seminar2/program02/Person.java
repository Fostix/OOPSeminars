package Seminar2.program02;

import java.util.ArrayList;

public class Person {

    public String fullName;

    private ArrayList<Person> family = new ArrayList<>();

    public ArrayList<Person> getFamily() {
        return family;
    }

    public void appendToFamily(Person p) {
        family.add(p);
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
