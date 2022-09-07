package MyExamples.Program002;

public class Person extends Animal{
    private final String name;
    private final String surname;
    private final byte hand;
    private final byte leg;

    public Person (byte eye, String color, byte ears, String colorEye, String name, String surname, byte hand, byte leg) {
        super(ears, eye, colorEye, color);
        this.name = name;
        this.surname = surname;
        this.hand = hand;
        this.leg = leg;
    }
}
