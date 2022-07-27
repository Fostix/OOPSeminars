package MyExamples.Program13ToDo.Core.MVP;

import MyExamples.Program13ToDo.Core.CreateFileStorage;
import MyExamples.Program13ToDo.Core.MrReadIsReadingStorages;
import MyExamples.Program13ToDo.Core.OnOffButton.Power;
import MyExamples.Program13ToDo.Core.ReadFileStorage;
import MyExamples.Program13ToDo.Core.Users.SaveUsers;
import MyExamples.Program13ToDo.Core.Users.Users;

import java.util.Scanner;

public class Model {
    private ReadFileStorage readFileStorage = new ReadFileStorage();
    private CreateFileStorage createFileStorage = new CreateFileStorage();
    private Power power = new Power();
    //private SaveUsers saveUser = new SaveUsers();

    public Model() {
    }

    public Power pressTheButtonPower() {
        power.power();
        return power;
    }

    // ??? ...

    public Users addNewUser() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();
        String patronymic = scanner.next();
        Users user = new Users(name, surname, patronymic);
        return user;
    }


    public void appendUser(Users user) {
        SaveUsers saveUsers = new SaveUsers(user);
    }

    public String checkFileToDo() {
        if (readFileStorage.check()) {
            readFile();
            return "have file";
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
        //JSObject json = new JSObject(FileWay.WAY_USERS);
        MrReadIsReadingStorages mrReadIsReadingStorages = new MrReadIsReadingStorages();
        System.out.println(mrReadIsReadingStorages.jsonRead() + " model method check");
    }

    @Override
    public String toString() {
        return String.format("%s", this.power);
    }
}



