package MyExamples.Program002;

public class Cat extends Animal{
    private byte paws;
    private byte tail;
    private String nickname;


    /** Create cat
     * @param ears количество ушей
     * @param eye количество глаз
     * @param colorEye цвет глаз
     * @param color цвет шерсти
     * @param paws количество лап
     * @param tail длина хвоста
     * @param nickname и наконец-то кличка  */
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

    @Override
    public String toString() {
        return String.format("nickname: %s, paws: %d\ntail: %d, %s",  this.nickname, this.paws, this.tail, super.toString());
    }
}
