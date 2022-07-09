package MyExamples.Program003;

public class Car {
    String color;
    String form;
    double engineV;
    double fuelConsumption;
    String id;
    double fuelInTank;

    void fillTank(int fuelV) {
        fuelInTank = fuelInTank + fuelV;
    }

    void drive(double distance) {
        fuelInTank = fuelInTank - distance / 100 * fuelConsumption;
    }

}
