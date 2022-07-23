package MyExamples.ProgramToDo.Formats;

import java.io.File;

public class JSON {
    File file = new File("src/MyExamples/ProgramToDo/Storage/JSONFormat.json");
    public boolean CheckFile() {
//        try { // can create file !!!
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        if (file.isFile()) return true;
        else return false;
    }
}
