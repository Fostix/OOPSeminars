package MyExamples.Program010PersonAndPetsSecond.Eat;

public class Sausage {
    private String mark;
    private int gram;

    public Sausage(String mark, int gram) {
        setMark(mark);
        setGram(gram);
    }

    public String getMark() {
        return this.mark;
    }

    public int getGram() {
        return gram;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    public String getInfo() {
        return String.format("Марка %s\nГрамм %d", this.mark, this.gram);
    }
}
