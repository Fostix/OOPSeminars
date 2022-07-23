package MyExamples.ProgramToDo;

import java.io.IOException;

public class Controller {
    private Power power = new Power();
    private ReadFile readFile = new ReadFile();
    public Controller() {
    }
    public Power pressTheButtonPower() {
        power.power();
        return power;
    }

    public void checkFile() {
        if (readFile.checkJson()) {
            System.out.println("lololololo");
            // read file
            // create file
            // дать выбор в каком формате хранить файлы
        }
        // if true to ??? READ?
    }

    public void readFile(){

    }

    @Override
    public String toString() {
        return String.format("%s", this.power);
    }
}
