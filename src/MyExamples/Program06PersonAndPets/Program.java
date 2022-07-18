package MyExamples.Program06PersonAndPets;

public class Program {
    public static void main(String[] args) {
        PrintConsole mrsConsole = new PrintConsole(); // Отдельная консолька

        // Person
        Animal p0 = new Person("Бахрума", "Махрумыч", (float) 70.5);
        mrsConsole.printConsole(p0.getInfo());





        // Cat
        System.out.println("------------------");
        Pet c0 = new Cat("Бармалей", (float) 2.2);
        mrsConsole.printConsole(c0.getInfo());
//        System.out.println(c0);


        // Dog
        System.out.println("------------------");
        Pet d0 = new Dog("Кубрик", (float) 9.9);
        mrsConsole.printConsole(d0.getInfo());
        System.out.println("------------------");

        ((Person) p0).call((Cat) c0); // положить колбасу
    }
}
