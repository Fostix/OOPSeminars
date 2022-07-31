package Tests.Program04;

public class Program {
    public static void main(String[] args) {
        Goo g0 = new Goo();
        g0.m(g0, 123);

        Goo g1 = new Goo();
        Goo g2 = new Goo();
        g1.m(g2, 1);

    }
}

class Goo {
    private int a;

    public void m (Goo g, int item) {
        g.a = item;
    }
}
