package Tests.Program03StaticTest;

public class Program {
}

class Doo {
    void a() {

    }

    static void b(){
        // a();
        Doo d = new Doo();
        d.a();
    }

    static void b1(Doo d){
        // a();
        d.a();
    }
}
