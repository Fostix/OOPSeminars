package MyExamples.Program13ToDo.Core.MVP;

import MyExamples.Program13ToDo.Core.CreateFileStorage;
import MyExamples.Program13ToDo.Core.Power;
import MyExamples.Program13ToDo.Core.ReadFileStorage;
import MyExamples.Program13ToDo.Core.Users.Users;

import java.util.Scanner;

public class Model {
    private ReadFileStorage readFileStorage = new ReadFileStorage();
    private CreateFileStorage createFileStorage = new CreateFileStorage();
    private Power power = new Power();
    private Users users = new Users();

    public Model() {
    }

    public Power pressTheButtonPower() {
        power.power();
        return power;
    }

    // ??? ...
    public String addNewUser() {
        Scanner scanner = new Scanner(System.in);
//        String name = scanner.next();
        String name = scanner.next();
        String surname = scanner.next();
        String patronymic = scanner.next();
        Users s = users.addUser(name, surname, patronymic);
        //System.out.println(s);
        //scanner.close();
        //scanner
        //users.addUser();
        // check have such user or not!

        return "newUser";
    }

    public int getUser() {
        return users.getId();
    }

    public String checkFile() {
        if (readFileStorage.check()) {
            readFile();
            return "have file";
            // дать выбор в каком формате хранить файлы?
        } else {
            if (!createFile()) {
                return "Нет прав доступа создавать всякие файлы, " +
                        "дайте разрешение и я тут щяс такое натворю :)";
            }
        }
        /* if true to ??? READ? */
        return "";
    }

    public boolean createFile() {
        return createFileStorage.createFileStorage();
    }

    public void readFile() {

    }

    @Override
    public String toString() {
        return String.format("%s", this.power);
    }
}



