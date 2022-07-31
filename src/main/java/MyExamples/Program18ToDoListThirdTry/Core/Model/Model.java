package MyExamples.Program18ToDoListThirdTry.Core.Model;

import MyExamples.Program18ToDoListThirdTry.Core.JSON.*;

public class Model {
    CheckFile checkStorageTasks = new CheckFile();
    ImportAndExport importAndExport = new ImportAndExport();
    CreateFileStorage createFileStorage = new CreateFileStorage();
    WriteInFile addTask = new WriteInFile();

    public boolean checkStorageTasks() {
        return checkStorageTasks.checkFile(FileWayStorage.WAY_TO_DO);
    }

    public boolean importAndExport() {
        return importAndExport.importAndExport(FileWayStorage.FOLDER_STORAGE);
    }

    public boolean createFileStorage() {
        return createFileStorage.createFileStorage(FileWayStorage.WAY_TO_DO);
    }

    public boolean addTask(String text) {
        return addTask.addTask(FileWayStorage.WAY_TO_DO, text);
    }

    public String readFile() {
        return "df";
    }
}
