package MyExamples.Transformers.Ex01Run;

public class Transformer {
    private int x;

    protected Transformer(int x) {
        this.x = x;
    }

    protected Transformer() {
        this.x = 0;
    }

    protected void run() {
        this.x += 1;
    }

    @Override
    public String toString() {
        return String.format("x = %d", this.x);
    }
}
