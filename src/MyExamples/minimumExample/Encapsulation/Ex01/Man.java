package MyExamples.minimumExample.Encapsulation.Ex01;

public class Man { // Инкапсулирован?
    /** Поле*/
    private String name; // Поле, приват что-бы нельзя присвоить другое значение через клиентский код.
    private int age; // final константа.

    /** Конструктор
     * @param name для комментирования.
     * @param age для комментирования.*/
    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }


    /** Второй конструктор. (выполнена перегрузка)
     * @param name для комментирования.*/
    public Man(String name) { // Конструктор.
        this.name = name; // this в контексте этого поля.
        this.age = 21;
    }

    /** Конструктор по умолчанию. (выполнена перегрузка) */
    public Man() {
        this.name = "Конструктор по умолчанию был использован";
    }


    /** Гетер?*/
    public int getAge() {
        return this.age;
    }

    /** Сеттер?*/
    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() { // Переопределение метода, (перегрузка?).
        return String.format("name: %s\nage: %d", this.name, this.age);
    }
}
