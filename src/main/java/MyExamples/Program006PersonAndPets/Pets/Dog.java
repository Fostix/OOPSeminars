package MyExamples.Program006PersonAndPets.Pets;

import MyExamples.Program006PersonAndPets.Animal;
import MyExamples.Program006PersonAndPets.PrintConsole;

import java.util.Random;

public class Dog extends Animal implements Pet {
    public Dog(String name, float weight) {
        super(name, weight);
    }

    public void comeUp(int sausage) {
        PrintConsole console = new PrintConsole();

        if (sausage < 1) {
            int random = new Random().nextInt(2);
            if (random > 0) {
                console.printConsole("Гав\nмедленно подходит собака\nГав");
            }
        } else {
            console.printConsole("Гав\nбежит собака и съедает колбасу");
        }
    }
}

