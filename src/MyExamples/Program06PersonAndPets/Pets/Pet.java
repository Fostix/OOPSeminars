package MyExamples.Program06PersonAndPets.Pets;

import MyExamples.Program06PersonAndPets.PrintConsole;

import java.util.ArrayList;
import java.util.Random;

public interface Pet{





    default void comeUp(int sausage) { // мможно ли это поведение реализовать тут, а не в отдельном классе?
        PrintConsole console = new PrintConsole();

        if (sausage < 1) { // снизить вероятность того что кошка подойдёт если нет еды
            int random = new Random().nextInt(2);
            if (random > 0) {
                console.printConsole("Мяу\nмедленно подходит кот\nмяу");
            } else {
                console.printConsole("Не хочет подходить");
            }

        } else {
            console.printConsole("Мяу\nбежит кот мяу и съедает колбасу");
        }
    }

    String getInfo();
}
