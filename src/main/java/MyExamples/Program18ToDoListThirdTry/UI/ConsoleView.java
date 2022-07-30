package MyExamples.Program18ToDoListThirdTry.UI;

import MyExamples.Program18ToDoListThirdTry.Core.Model.View;

import java.util.Scanner;

public class ConsoleView implements View {
    Scanner in;
    public ConsoleView() {
        in = new Scanner(System.in);
    }
    @Override
    public void haveStorageFileTasks() {
        System.out.println("Файл с заданиями присутствует😀");
    }
    @Override
    public void doNotHaveStorageFileTasks() {
        System.out.println("Первый запуск, если хотите импортировать данные то нажмите 9!!");
    }

    @Override
    public void cannotImportAndExport() {
        System.out.println("что то пошло не так");
    }

    @Override
    public void goodCreateFileStorageTasks() {
        System.out.println("Файл создан успешно");
    }

    @Override
    public void cannotCreateFileStorageTasks() {
        System.out.println("Не удалось создать хранили, осторожно созданные напоминания не будут сохраняться!!");
    }

    @Override
    public String addTask() {
        System.out.print("Введите задание: ");
        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();
        return test;
        // дальше продумать как добавить важность и т.п!!
    }
}
