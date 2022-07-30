package MyExamples.Program13ToDo.Core.Formats.Interfaces;

import java.io.File;
import java.io.IOException;

public interface CreateFile {
    default boolean createFile(File file) {
        try {
            file.createNewFile();
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}
