package MyExamples.Program14TryCreateButtonOnOff;

import java.util.Objects;
import java.util.Scanner;

public class View {
    public View() {
        Power p = new Power();
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                String key = in.next();
                System.out.println(key);
                if (Objects.equals(key, "1")) {
                    System.out.println(p.power());
                }
            }
        }
    }
}
