package MyExamples.Program13ToDo.Core;

import MyExamples.Program13ToDo.Core.Formats.JSON;

public class CreateFileStorage {
    private JSON json = new JSON(); // then maybe add another formats!!
    public boolean createFileStorage() {
        return json.createFile();
    }
}
