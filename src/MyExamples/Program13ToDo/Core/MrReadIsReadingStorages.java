package MyExamples.Program13ToDo.Core;

import MyExamples.Program13ToDo.Core.Formats.Interfaces.FileWay;
import MyExamples.Program13ToDo.Core.Formats.JSON;

public class MrReadIsReadingStorages {
    public String jsonRead() {
        JSON json = new JSON();
        return json.jsonRead(FileWay.WAY_USERS);
    }
}
