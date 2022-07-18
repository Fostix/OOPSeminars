package MyExamples.Program004PetAndMaster;

public abstract class Pet extends Animal {

    /**
     * @param name   имя
     * @param weight вес
     */
    public Pet(String name, String weight) {
        super(name, weight);
    }


    public abstract void runToTheOwner();



}
