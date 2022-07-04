package MyExamples.Program002;

public abstract class Animal {
    protected final byte ears; // Уши.
    protected final byte eye;
    protected final String colorEye;
    protected final String color;


    protected Animal(byte ears, byte eye, String colorEye, String color) {
        this.ears = ears;
        this.eye = eye;
        this.colorEye = colorEye;
        this.color = color;
    }

    protected Animal() {
        this.ears = 2;
        this.eye = 2;
        this.colorEye = "Yellow";
        this.color = "White";
    }

}
