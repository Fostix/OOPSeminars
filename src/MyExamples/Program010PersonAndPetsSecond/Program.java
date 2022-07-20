package MyExamples.Program010PersonAndPetsSecond;

import MyExamples.Program010PersonAndPetsSecond.Eat.Sausage;
import MyExamples.Program010PersonAndPetsSecond.Pets.Cat;
import MyExamples.Program010PersonAndPetsSecond.Pets.Dog;
import MyExamples.Program010PersonAndPetsSecond.Pets.Pet;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        // Person
        Person p0 = new Person("Бахрума", "Махрумыч", (float) 70.5);
        p0.getLastName();

        // Еда
        System.out.println("-----------Создал еду----------");
        Sausage sau = new Sausage("Колбасёнок", 500);
        System.out.println(sau.getInfo());

        // Add cat
        System.out.println("---------Создал кота---------");
        ArrayList<Pet> myPets = new ArrayList<>(); // добавили кошку.
        myPets.add(new Cat("Бармалей", (float) 2.2));
        System.out.println(myPets.get(0).getInfo());
        System.out.println("-----------Позвали кота без еды-------------");
        p0.call(myPets.get(0)); // без еды кот может не подойти к хозяину.

        // человек взял колбасу что-бы покормить котенка.
        System.out.println("-----------Позвали кота с едой-------------");
        p0.takeSausage(sau);
        p0.call(myPets.get(0));
        System.out.println(p0.getInfo());

        myPets.remove(0); // Бармалей пропал.
        System.out.println("---------Кот пропал-------------");

        // Add dog
        System.out.println("----------Новый питомец собака--------");
        myPets.add(new Dog("Кубрик", (float) 9.9)); // новый питомец собака.
        System.out.println(myPets.get(0).getInfo());
        p0.call(myPets.get(0));
    }
}