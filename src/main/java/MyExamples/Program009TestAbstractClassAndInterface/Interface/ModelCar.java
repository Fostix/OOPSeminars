package MyExamples.Program009TestAbstractClassAndInterface.Interface;

public interface ModelCar {
    // У интерфейсов не может быть конструктора!
    String model = "";

    default String getInfo() {
        return model;
    }
}
