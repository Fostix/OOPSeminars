package Tests.Program02StorageCount;

public class Program { // Хранилище для подсчёта экземпляров
    public static void main(String[] args) {
        Storage s = new Storage();
        Foo f1 = new Foo(s);
        Foo f2 = new Foo(s);
        Foo f3 = new Foo(s);
        Foo f4 = new Foo(s);
        f4.a();
        f2.a();
        f1.a();
    }
}

class Foo {
    Storage cs;

    public Foo(Storage s) {
        cs = s;
        cs.inc();
    }

    public void a() {
        System.out.println(cs.a);
    }
}


class Storage {
    int a;

    void inc() {
        a++;
    }
}