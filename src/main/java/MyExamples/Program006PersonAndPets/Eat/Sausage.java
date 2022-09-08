package MyExamples.Program006PersonAndPets.Eat;

public class Sausage {
    private String mark;
    private int gram;

    public Sausage(String mark, int gram) {
        this.mark = mark;
        this.gram = gram;
    }

    public int infoGram() {
        return gram;
    }

    public String getInfo() {
        return String.format("Марка %s\nГрамм %d", this.mark, this.gram);
    }
}
