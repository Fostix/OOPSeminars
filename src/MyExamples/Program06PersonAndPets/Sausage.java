package MyExamples.Program06PersonAndPets;

public class Sausage {
    String mark;
    int gram;

    public Sausage(String mark, int gram) {
        this.mark = mark;
        this.gram = gram;
    }


    public String getInfo() {
        return String.format("Марка %s\nГрамм%d", this.mark, this.gram);
    }




}
