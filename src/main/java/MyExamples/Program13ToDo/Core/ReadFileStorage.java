package MyExamples.Program13ToDo.Core;

import MyExamples.Program13ToDo.Core.Formats.Interfaces.FileWay;
import MyExamples.Program13ToDo.Core.Formats.JSON;


public class ReadFileStorage {
    JSON json = new JSON(); // For activate JSON class!!

    public boolean check() {
        return json.checkFile(FileWay.WAY_TO_DO);
    }

    protected boolean readFile() {
        return true;
    }
}
