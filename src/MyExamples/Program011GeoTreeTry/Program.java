package MyExamples.Program011GeoTreeTry;

import MyExamples.Program011GeoTreeTry.Generators.DateGenerator;

import java.util.Random;

public class Program {
    public static void main(String[] args) {
        DateGenerator dateGenerator = new DateGenerator();
        String randomDate = dateGenerator.dateGenerator();
        System.out.println(randomDate);
//
//        Random rand = new Random();
//        for (int i = 0; i < 100; i++) {
//            boolean bool = rand.nextBoolean();
//            System.out.println(bool);
//        }

        // tests
        Person p0 = new Person("Mark", "James", "2", "жыв");
        System.out.println(p0);
        for (int i = 0; i < 100; i++) {
            Person p1 = new Person("sd", "sd");
            System.out.println(p1);
        }
    }
}
