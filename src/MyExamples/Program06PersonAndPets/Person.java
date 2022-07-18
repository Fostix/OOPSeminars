package MyExamples.Program06PersonAndPets;

public class Person extends Animal{

    private String lastName;


    public Person(String name, String lastName, float weight) {
        super(name, weight);
        this.lastName = lastName;
    }


    public void call(Cat cat) {
        PrintConsole console = new PrintConsole();
        console.printConsole("Кис-кис-кис");
        cat.comeUp();

    }



    @Override
    public String getInfo() {
        return String.format("Фамилия %s\nИмя %s\nВес %.1f",
                this.lastName, this.getName(), this.getWeight());
    }


    @Override
    public String toString() {
        return String.format("Фамилия %s\n%s",
                this.lastName, super.toString());
    }
}
