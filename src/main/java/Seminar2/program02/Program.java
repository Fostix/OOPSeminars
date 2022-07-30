package Seminar2.program02;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        Person natasha = new Person("Наташа");
        Person alex = new Person("Саша");
        Person mary = new Person("Маша");
        Person n021 = new Person("Алла");
        Person n022 = new Person("Иван");
        Person n011 = new Person("Валера");

        natasha.appendToFamily(alex);
        natasha.appendToFamily(mary);
        alex.appendToFamily(n011);
        mary.appendToFamily(n021);
        mary.appendToFamily(n022);

        Research(natasha, "");
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

