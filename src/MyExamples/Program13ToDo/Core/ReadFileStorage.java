package MyExamples.Program13ToDo.Core;

import MyExamples.Program13ToDo.Core.Formats.JSON;


public class ReadFileStorage {
    JSON json = new JSON(); // For activate JSON class!!

    public boolean check() {
        return json.checkFile();
    }

    protected boolean readFile() {
        return true;
    }
}
