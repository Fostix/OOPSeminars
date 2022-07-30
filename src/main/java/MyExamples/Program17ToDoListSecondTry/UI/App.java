package MyExamples.Program17ToDoListSecondTry.UI;

import java.util.Scanner;

public class App {
    public void menu() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("----Нажмите 1 что бы включить программу----");
                int enter = scanner.nextInt();
                while (enter == 1) {
                    System.out.println("----Система включена----");
                    enter = scanner.nextInt();
                    if (enter == 0) {
                        System.out.println("----Система выключена----");
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Enter number!!");
            }
        }
    }
}
