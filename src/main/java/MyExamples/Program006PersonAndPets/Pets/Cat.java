package MyExamples.Program006PersonAndPets.Pets;

import MyExamples.Program006PersonAndPets.Animal;
import MyExamples.Program006PersonAndPets.PrintConsole;

import java.util.Random;

public class Cat extends Animal implements Pet {
    public Cat(String name, float weight) {
        super(name, weight);
    }

    public void comeUp(int sausage) { // подойти к хозяину
        PrintConsole console = new PrintConsole();

        if (sausage < 1) { // снизить вероятность того что кошка подойдё если нет еды
            int random = new Random().nextInt(2);
            if (random > 0) {
                console.printConsole("Мяу\nмедленно подходит кот\nмяу");
            }
        } else {
            console.printConsole("Мяу\nбежит кот мяу и съедает колбасу");
        }
    }
}
