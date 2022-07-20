package MyExamples.Program009TestAbstractClassAndInterface.AbstractClassTest;

public abstract class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        //return model;
        return String.format("model %s", this.model);
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return String.format("model %s", this.model);
    }
}
