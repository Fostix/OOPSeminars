package MyExamples.ProgramToDo;

public class Power {
    private ButtonOnOff state;
    protected void power() {
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
