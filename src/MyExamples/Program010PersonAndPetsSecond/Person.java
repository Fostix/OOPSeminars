package MyExamples.Program010PersonAndPetsSecond;

import MyExamples.Program010PersonAndPetsSecond.Eat.Sausage;
import MyExamples.Program010PersonAndPetsSecond.Pets.Pet;

public class Person extends Animal {
    private String lastName;
    private int sausageOnHand;

    public Person(String name, String lastName, float weight) {
        super(name, weight);
        this.lastName = lastName;
        setLastName(lastName);
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
        if (sausage.getGram() > 0) {
            this.sausageOnHand++;
        }
    }

    public String getLastName() {
        return String.format("Фамилия: %s", this.lastName);
    }

    public String setLastName(String lastName) {
        return this.lastName = lastName;
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
