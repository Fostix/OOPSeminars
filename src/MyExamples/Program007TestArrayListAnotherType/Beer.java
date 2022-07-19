package MyExamples.Program007TestArrayListAnotherType;

public class Beer {
    private String mark;
    private double litres;

    public Beer(String mark, double litres) {
        this.mark = mark;
        this.litres = litres;
    }

    public String getMark() {
        return this.mark;
    }

    public double getLitres() {
        return this.litres;
    }

    @Override
    public String toString() {
        return String.format("mark: %s\nlitres: %.1f", this.mark, this.litres);
    }
}

