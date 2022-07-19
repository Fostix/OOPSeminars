package MyExamples.Program06PersonAndPets;

import MyExamples.Program06PersonAndPets.Eat.Sausage;
import MyExamples.Program06PersonAndPets.Pets.Cat;
import MyExamples.Program06PersonAndPets.Pets.Dog;
import MyExamples.Program06PersonAndPets.Pets.Pet;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        PrintConsole mrsConsole = new PrintConsole(); // Отдельная консолька.

        // Person
        Animal p0 = new Person("Бахрума", "Махрумыч", (float) 70.5);
        mrsConsole.printConsole(p0.getInfo());


        // Еда
        System.out.println("-----------Создал еду----------");
        Sausage sau = new Sausage("Колбасёнок", 500);
        mrsConsole.printConsole(sau.getInfo());


        // Add cat
        System.out.println("---------Создал кота---------");
        ArrayList<Pet> myPets = new ArrayList<>(); // добавили кошку.
        myPets.add(new Cat("Бармалей", (float) 2.2));
        mrsConsole.printConsole(myPets.get(0).getInfo());
        System.out.println("-----------Позвали кота без еды-------------");
        ((Person) p0).call((Pet) myPets.get(0)); // без еды кот может не подойти к хозяину.


        // человек взял колбасу что-бы покормить котенка.
        System.out.println("-----------Позвали кота с едой-------------");
        ((Person) p0).takeSausage(sau);
        ((Person) p0).call((Pet) myPets.get(0));
        mrsConsole.printConsole(p0.getInfo());

        myPets.remove(0); // Бармалей пропал.
        System.out.println("---------Кот пропал-------------");



        // Add dog
        System.out.println("----------Новый питомец собака--------");
        myPets.add(new Dog("Кубрик", (float) 9.9)); // новый питомец собака.
        mrsConsole.printConsole(myPets.get(0).getInfo());
        ((Person) p0).call(myPets.get(0));

    }
}
