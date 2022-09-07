package MyExamples.Transformers.Ex01Run;

public class Program {
    public static void main(String[] args) {
        Transformer optimus = new Transformer(0);
        optimus.run();
        System.out.println(optimus);
        for (int i = 0; i < 10000; i++) {
            optimus.run();
        }
        System.out.println(optimus);
    }



}
