package MyExamples.Program002;

public abstract class Animal {
    private byte ears; // Уши.
    private byte eye;
    private String colorEye;
    private String color;


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

    @Override
    public String toString() {
        return String.format("ears: %d\neye: %d color eye: %s\ncolorL: %s", this.ears, this.eye, this.colorEye, this.color);
    }
}
