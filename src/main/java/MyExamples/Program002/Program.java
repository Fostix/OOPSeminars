package MyExamples.Program002;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Animal c = new Cat((byte) 2, (byte) 2, "green", "gray", (byte) 4, (byte) 2, "Бармалей");
        System.out.println(c);
        Clothing shorts = new Shorts();
        List<String> capboard = new ArrayList<>();
        //System.out.println(shorts);
        System.out.println(capboard);
    }
}
