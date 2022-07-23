package MyExamples.Program011GeoTreeTry;

import MyExamples.Program011GeoTreeTry.Generators.DateGenerator;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        // Проблем много бабушка может оказаться мужчиной :D, возраста не совпадать.
        // Поиска нет просто вывод всех данных.
        Person p0 = new Person();
        GeoTree family = new GeoTree(p0);
        family.append(new Relatives("Дети", 1));
        family.append(new Relatives("Мама", 1));
        family.append(new Relatives("Отец", 1));
        family.append(new Relatives("Сестры", 3));
        family.append(new Relatives("Братья", 2));
        family.append(new Relatives("Бабушки", 2));
        family.append(new Relatives("Свекровь", 1));
        System.out.println(family);
    }
}
