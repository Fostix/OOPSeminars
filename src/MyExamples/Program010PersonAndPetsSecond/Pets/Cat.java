package MyExamples.Program010PersonAndPetsSecond.Pets;

import MyExamples.Program010PersonAndPetsSecond.Animal;

public class Cat extends Animal implements Pet {
    private final String[] myRoles = {
            String.format("Мяу\nмедленно подходит кот по кличке %s\nмяу", super.getName()),
            String.format("Мяу\nбежит кот по кличке %s мяу и съедает колбасу", super.getName()),
            String.format("Кошка по кличке %s не подходит", super.getName())
    };

    public Cat(String name, float weight) {
        super(name, weight);
    }

    public void comeUp(int sausage) {
        Pet.super.comeUp(sausage, myRoles);
    }
}
