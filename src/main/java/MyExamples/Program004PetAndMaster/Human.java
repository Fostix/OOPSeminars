package MyExamples.Program004PetAndMaster;

public class Human extends Master {

    @Override
    public void callAllPets() {
        System.out.println("А ну сюды все!!");
    }

    @Override
    public void callDog() {
        System.out.println("доги дог");
    }

    @Override
    public void callCat() {
        System.out.println("кети кет");
    }
}
