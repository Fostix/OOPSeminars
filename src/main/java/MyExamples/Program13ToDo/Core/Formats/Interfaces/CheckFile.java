package MyExamples.Program13ToDo.Core.Formats.Interfaces;

import java.io.File;

public interface CheckFile {

    default boolean checkFile(File file) {
        return file.isFile();
    }
}
