package MyExamples.Program003;

public class Program {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.fuelConsumption = 10;
        Car myBrotherCar = new Car();

        myCar.fillTank(20);

        System.out.println(myCar.fuelInTank);

        Human sister = new Human("Bogomila");
        System.out.println(sister);

    }
}
