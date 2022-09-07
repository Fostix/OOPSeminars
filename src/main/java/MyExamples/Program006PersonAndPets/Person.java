package MyExamples.Program006PersonAndPets;


import MyExamples.Program006PersonAndPets.Eat.Sausage;
import MyExamples.Program006PersonAndPets.Pets.Pet;

public class Person extends Animal{
    private String lastName;
    private int sausageOnHand;

    public Person(String name, String lastName, float weight) {
        super(name, weight);
        this.lastName = lastName;
    }

    public void call(Pet pet) {
        PrintConsole console = new PrintConsole();
        console.printConsole("Позвать питомца");
        pet.comeUp(sausageOnHand);
        if (sausageOnHand > 0) {
            sausageOnHand--;
        }
    }

    public void takeSausage(Sausage sausage) {
        if (sausage.infoGram() > 0) {
            this.sausageOnHand++;
        }
    }

    @Override
    public String getInfo() {
        return String.format("Фамилия %s\nИмя %s\nВес %.1f\nв руке %d колбаса(ы)",
                this.lastName, this.getName(), this.getWeight(), this.sausageOnHand);
    }

    @Override
    public String toString() {
        return String.format("Фамилия %s\n%s\nв руке %d колбаса(ы)",
                this.lastName, super.toString(), this.sausageOnHand);
    }
}
