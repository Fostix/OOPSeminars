package MyExamples.Program13ToDo.Core.Users;

import MyExamples.Program13ToDo.Core.Formats.Interfaces.FileWay;

import java.io.FileWriter;
import java.io.IOException;

public class SaveUsers implements FileWay {
    public SaveUsers(Users user) {
        try {
            FileWriter writer = new FileWriter(FileWay.WAY_USERS);
            String text = String.valueOf(user.getId());
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            System.out.println("что то пошло не так!!");
            throw new RuntimeException(e);
        }
    }
}
