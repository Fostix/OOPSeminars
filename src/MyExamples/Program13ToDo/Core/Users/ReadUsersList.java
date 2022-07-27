package MyExamples.Program13ToDo.Core.Users;

import MyExamples.Program13ToDo.Core.Formats.Interfaces.FileWay;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadUsersList {
    public String usersInfo() throws FileNotFoundException {
        FileReader fileReader = new FileReader(FileWay.WAY_USERS);
        System.out.println(fileReader + "readUsers"); //////
        return "sdf";
    }
}
