package MyExamples.ProgramToDo;

import MyExamples.ProgramToDo.Formats.JSON;

public class ReadFile {
    public boolean checkJson() {
        JSON json = new JSON();
        if (json.CheckFile()) return true;
        else return false;
    }
}
