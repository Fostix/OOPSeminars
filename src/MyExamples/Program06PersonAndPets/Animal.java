package MyExamples.Program06PersonAndPets;

public abstract class Animal{
    private String name;
    private float weight;

    public Animal(String name, float weight) {
        this.name = name;
        this.weight = weight;
    }

    //public abstract void call();


    public float getWeight() {
        return weight;
    }

    protected String getName() {
        return name;
    }

    //@Override
    public String getInfo() {
        return String.format("Кличка %s\nВес %.1f", this.name, this.weight);
    }

    @Override
    public String toString() {
        return String.format("Кличка %s\nВес: %.1f", this.name, this.weight);
    }
}
