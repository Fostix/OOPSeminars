package MyExamples.Program13ToDo.Client;

import MyExamples.Program13ToDo.Core.MVP.Model;

import java.util.Objects;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Model control = new Model();
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("Press 1 for on system : )");
                String key = in.next();
                if (Objects.equals(key, "1")) {
                    System.out.println(control.pressTheButtonPower()); // кнопка ничего не делает пока что?
                    control.appendUser((control.addNewUser()));
                    control.readFile();
                    control.checkFileToDo(); // "файл проверен"
                    control.createFile(); // "Файл создан"
                }
            }
        }
    }
}