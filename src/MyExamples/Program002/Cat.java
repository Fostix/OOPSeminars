package MyExamples.Program002;

public class Cat extends Animal{
    protected final byte paws;
    protected final byte tail;
    protected final String nickname;


    protected Cat(byte ears, byte eye, String colorEye, String color, byte paws, byte tail, String nickname) {
        super(ears, eye, colorEye, color);
        this.paws = paws;
        this.tail = tail;
        this.nickname = nickname;
    }

    protected Cat() {
        this.paws = 4;
        this.tail = 1;
        this.nickname = "nickname";
    }
}
