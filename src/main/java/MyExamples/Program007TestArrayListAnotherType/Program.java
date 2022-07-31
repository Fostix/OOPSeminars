package MyExamples.Program007TestArrayListAnotherType;

public class Program {
    public static void main(String[] args) {
        Beer n = new Beer("Golden", 0.1);
        System.out.println(n.getMark());
        System.out.println(n);
        Check forCheck = new Check();
        forCheck.addBeer(n);
    }
}
