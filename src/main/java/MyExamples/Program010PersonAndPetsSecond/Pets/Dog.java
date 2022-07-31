package MyExamples.Program010PersonAndPetsSecond.Pets;

import MyExamples.Program010PersonAndPetsSecond.Animal;

public class Dog extends Animal implements Pet {
    private final String[] myRoles = {
            String.format("Гав\nмедленно подходит собака по кличке %s\nГав", super.getName()),
            String.format("Гав\nбежит собака по кличке %s и съедает колбасу", super.getInfo()),
            String.format("Собака по кличке %s не подходит", super.getName())
    };
    public Dog(String name, float weight) {
        super(name, weight);
    }

    @Override
    public void comeUp(int sausage) {
        Pet.super.comeUp(sausage, myRoles);
    }
}

