package MyExamples.Program13ToDo.Core.Formats;

import MyExamples.Program13ToDo.Core.Formats.Interfaces.CheckFile;
import MyExamples.Program13ToDo.Core.Formats.Interfaces.CreateFile;
import MyExamples.Program13ToDo.Core.Formats.Interfaces.FileWay;

public class JSON implements CheckFile, CreateFile {

    public boolean checkFile(){
        return checkFile(FileWay.file);
    }

    public boolean createFile() {
        return createFile(FileWay.file);
    }
}
