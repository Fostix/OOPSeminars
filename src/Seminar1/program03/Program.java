package Seminar1.program03;

public class Program {
    public static void main(String[] args) {
        Person p = new Person(1, "name", "lastName");

        p.printId();
        System.out.println(p);
        Person p1 = new Person();
        p1.printId();
        System.out.println(p1);

        System.out.println("----------------");
        p.printId();
        System.out.println(p);
        int n = p.printId();
        System.out.println(n);
    }
}
