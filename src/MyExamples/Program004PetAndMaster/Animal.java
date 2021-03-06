package MyExamples.Program004PetAndMaster;

public abstract class Animal {
    private String name;
    private String weight;

    /**
     * @param name имя
     * @param weight вес
     * */
    public Animal(String name, String weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", this.name, this.weight);
    }
}