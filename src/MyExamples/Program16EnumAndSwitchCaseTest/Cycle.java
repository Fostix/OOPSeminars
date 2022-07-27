package MyExamples.Program16EnumAndSwitchCaseTest;

import java.util.Scanner;

public class Cycle {

    public void ButtonClick() {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                int key = Integer.parseInt(in.next());
                switch (key) {
                    case 1:
                        System.out.println(Sign.HOW_ARE_YOU);
                        break;
                    case 2:
                        System.out.println(Sign.TEST);
                        break;
                    case 3:
                        System.out.println(Sign.LOL);
                        break;
                }
            }
        }
    }
}
