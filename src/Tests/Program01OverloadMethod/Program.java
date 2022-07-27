package Tests.Program01OverloadMethod;

public class Program {
    public static void main(String[] args) {
        Program test = new Program();
        test.a();
    }

    void a() {
    }

    int a(int a) {
        return a;
    }
}
