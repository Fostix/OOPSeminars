package MyExamples.Program06PersonAndPets;

public class Cat extends Animal implements Pet{
    public Cat(String name, float weight) {
        super(name, weight);
    }

    public void comeUp() { // подойти к хозяину
        PrintConsole c = new PrintConsole();
        c.printConsole("Мяу\nтык-тык-тык\nмяу");

    }


    // Колбаса
}
