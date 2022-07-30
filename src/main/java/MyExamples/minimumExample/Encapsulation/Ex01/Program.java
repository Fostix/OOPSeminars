package MyExamples.minimumExample.Encapsulation.Ex01;

public class Program {
    public static void main(String[] args) {
        Man person = new Man("Пурзан"); // Создал конкретный экземпляр.
        Man secondPerson = new Man("Бармалей", 999); // Второй экземпляр.
        Man thirdPerson = new Man(); // Третий экземпляр.
        System.out.println(person); // Информация видна только из-за переопределённого метода.
        System.out.println(secondPerson);
        System.out.println(secondPerson.getAge()); // Вызван гетер?
        secondPerson.setAge(12); // Вызван сеттер?
        System.out.println(secondPerson.getAge());



    }
}
