package MyExamples.Program06PersonAndPets.Eat;

public class Sausage {
    String mark;
    int gram;

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
