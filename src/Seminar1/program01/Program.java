package Seminar1.program01;

import java.util.ArrayList;

//

public class Program {
    public static void main(String[] args) {
        Person n0 = new Person("Наташа");
        Person n01 = new Person("Саша");
        Person n02 = new Person("Маша");
        Person n021 = new Person("Алла");
        Person n022 = new Person("Иван");
        Person n011 = new Person("Валера");

        n0.appendToFamily(n01);
        n0.appendToFamily(n02);
        n01.appendToFamily(n011);
        n02.appendToFamily(n021);
        n02.appendToFamily(n022);

        Research(n0, "");

    }

    static void Research(Person root, String sp) {
        if (root != null) {
            System.out.println(sp + root.fullName);
            for (Person item : root.getFamily()) {
                Research(item, sp + "  ");
            }
        }
    }
}

class Person {



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
