package MyExamples.Program009TestAbstractClassAndInterface.Interface;

public class Program {
    public static void main(String[] args) {
        Car herCar = new DieselCar();
        System.out.println(herCar.brrr());
        System.out.printf("-".repeat(50));
    }
}
