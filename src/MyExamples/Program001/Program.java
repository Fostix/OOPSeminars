package MyExamples.Program001;

public class Program {
    public static void main(String[] args) {

        // Cup firstCup1 = new Cup(0.1F, 0.1F);
        // Cup firstCup0 = new Cup(0.1F);
        Cup firstCup = new Cup();

        for (int i = 0; i < 7; i++) {
            System.out.print(firstCup);
            firstCup.cupFillingOneMilliliter();
            System.out.println("--------------------------");
        }
            System.out.print(firstCup);


    }
}
