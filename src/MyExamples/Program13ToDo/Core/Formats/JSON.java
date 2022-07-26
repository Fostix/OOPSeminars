package MyExamples.Program13ToDo.Core.Formats;

import MyExamples.Program13ToDo.Core.Formats.Interfaces.CheckFile;
import MyExamples.Program13ToDo.Core.Formats.Interfaces.CreateFile;
import MyExamples.Program13ToDo.Core.Formats.Interfaces.FileWay;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JSON implements CheckFile, CreateFile {

    public boolean checkFile(FileWay fileWay) {
        return checkFile(fileWay);
    }

    public boolean createFile() {
        return createFile(FileWay.WAY_TO_DO);
    }

    public String jsonRead(File way) { // file что это fileway!!
        try {
            BufferedReader mrBufferedReader = new BufferedReader(new FileReader((way)));
            String mrString;
            while ((mrString = mrBufferedReader.readLine()) != null) {
                return mrString;
            }
            mrBufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "broke jsonRead Method JSON"; // тут может что-то пойти не так
    }
}