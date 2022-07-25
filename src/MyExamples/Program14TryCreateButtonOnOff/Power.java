package MyExamples.Program14TryCreateButtonOnOff;

public class Power {
    private ButtonOnOff state;
    public boolean power() {
            if (this.state == ButtonOnOff.ON) {
                this.state = ButtonOnOff.OFF;
                return true;
            }
        else {
            this.state = ButtonOnOff.ON;
            return false;
        }
    }
}
