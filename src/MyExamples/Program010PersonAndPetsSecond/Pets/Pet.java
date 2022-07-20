package MyExamples.Program010PersonAndPetsSecond.Pets;

import java.util.Random;

public interface Pet {
    default void comeUp(int sausage, String[] roles) {
        if (sausage < 1) {
            int random = new Random().nextInt(2);
            if (random > 0) {
                System.out.println(roles[0]);
            } else {
                System.out.println(roles[2]);
            }
        } else {
            System.out.println(roles[1]);
        }
    }

    void comeUp(int sausage);

    String getInfo();
}