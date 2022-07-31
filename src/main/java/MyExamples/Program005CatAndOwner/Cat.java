package MyExamples.Program005CatAndOwner;

public class Cat {
    private String nickName;

    public Cat(String nickName) {
        this.nickName = nickName;
    }

    public void goOwner() {
        System.out.println("топ-топ-топ-топ-топ-мяу");

    }

    @Override
    public String toString() {
        return String.format("%s", this.nickName);
    }
}
