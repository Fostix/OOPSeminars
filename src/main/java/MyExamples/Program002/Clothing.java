package MyExamples.Program002;

public abstract class Clothing {
    private int id;
    private String cloth;
    private String color;

    protected Clothing() {
        this.cloth = "wool";
        this.color = "white";
    }

    @Override
    public String toString() {
        return String.format("id: %d, cloth: %s, color: %s", this.id, this.cloth, this.color);
    }
}
