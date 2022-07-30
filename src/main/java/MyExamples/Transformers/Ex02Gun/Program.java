package MyExamples.Transformers.Ex02Gun;

public class Program {
    public static void main(String[] args) {
        Gun firstGun = new Gun();
        Gun secondGun = new Gun();
        Transformer optimus = new Transformer(firstGun, secondGun);
        System.out.println(optimus);
        optimus.fire();
        System.out.println(optimus);
        for (int i = 0; i < 10; i++) {
            optimus.fire();
        }
        System.out.println(optimus);

    }
}
