package MyExamples.Program13ToDo.Core;

public class Power {
    private ButtonOnOff state;

    public Power() {
        this.state = ButtonOnOff.OFF;
    }
    public void power() {
        if (this.state == ButtonOnOff.ON) {
            this.state = ButtonOnOff.OFF;
        } else {
            this.state = ButtonOnOff.ON;
        }
    }

    @Override
    public String toString() {
        return String.format("%s", this.state);
    }
}
