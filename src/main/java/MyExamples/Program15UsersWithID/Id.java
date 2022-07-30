package MyExamples.Program15UsersWithID;

import java.util.Random;

public class Id {
    private int number;
    public Id() {
        Random r = new Random();
        this.number = r.nextInt(100);
        getId();
    }

    public int getId() {
        return number;
    }
}
