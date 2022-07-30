package Tests.Program05OpenFolder;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Desktop.getDesktop().open(new File("C:\\folder"));
        Desktop desktop = Desktop.getDesktop();
        File dirToOpen = null;
        try {
            dirToOpen = new File("/");
            desktop.open(dirToOpen);
        } catch (IllegalArgumentException iae) {
            System.out.println("File Not Found");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
