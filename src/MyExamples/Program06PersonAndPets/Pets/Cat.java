package MyExamples.Program06PersonAndPets.Pets;

import MyExamples.Program06PersonAndPets.Animal;
import MyExamples.Program06PersonAndPets.PrintConsole;

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
