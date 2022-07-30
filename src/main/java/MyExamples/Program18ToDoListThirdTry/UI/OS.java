package MyExamples.Program18ToDoListThirdTry.UI;

import MyExamples.Program18ToDoListThirdTry.Core.Model.Presenter;

import java.util.Scanner;

public class OS {
    public void oning() {
        Scanner scanner = new Scanner(System.in);
        Presenter presenter = new Presenter(new ConsoleView());
        if (!presenter.checkFiles()) {
            System.out.println("Создание хранилища...");
            presenter.createFileStorage();
        }
        App menu = new App();
        menu.menu();
    }
}
