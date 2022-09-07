package MyExamples.Transformers.Ex02Gun;

public class Gun {
    private int ammoCount;

    protected Gun() {
        this.reload();
    }

    public void fire() {
        this.ammoCount -= 1;
    }

    protected void reload() {
        this.ammoCount = 10;
    }


    /** Информация сколько патронов осталось*/
    public int getInfo() {
        return ammoCount;
    }

}
