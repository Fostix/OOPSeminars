package MyExamples.Program009TestAbstractClassAndInterface.AbstractClassTest;

public class Program {
    public static void main(String[] args) {
        System.out.println("------------------------");
        Car hisCar = new DieselCar("tractor");
        System.out.println(hisCar);
        System.out.println(hisCar.getModel());
        hisCar.setModel("Maclaren");
        System.out.println(hisCar.getModel());
        System.out.printf("-".repeat(50));
    }
}
