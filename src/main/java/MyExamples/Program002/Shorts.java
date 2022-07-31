package MyExamples.Program002;

public class Shorts extends Clothing{
    private int pockets;
    private int size;

    protected Shorts(int pockets, int size) {
        this.pockets = pockets;
        this.size = size;
    }

    protected Shorts() {
        this.pockets = 2;
        this.size = 48;
    }

    @Override
    public String toString() {
        //toString();
        String a = toString();
        System.out.println(a); // test!!
        return String.format("pockets: %d, size: %d", this.pockets, this.size);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        // make better!!
        return size;
    }
}
