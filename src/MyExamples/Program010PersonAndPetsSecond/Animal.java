package MyExamples.Program010PersonAndPetsSecond;

public abstract class Animal {
    private String name;
    private float weight;

    public Animal(String name, float weight) {
        rename(name);
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public String rename(String name) {
        return this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getInfo() {
        return String.format("Кличка %s\nВес %.1f", this.name, this.weight);
    }

    @Override
    public String toString() {
        return String.format("Кличка %s\nВес: %.1f", this.name, this.weight);
    }
}