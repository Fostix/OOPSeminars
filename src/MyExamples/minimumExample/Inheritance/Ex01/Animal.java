package MyExamples.minimumExample.Inheritance.Ex01;

public abstract class Animal { // Базовый класс.
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("age: %d", this.age);
    }
}
