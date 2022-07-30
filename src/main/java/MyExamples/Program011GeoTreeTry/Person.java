package MyExamples.Program011GeoTreeTry;

import MyExamples.Program011GeoTreeTry.Generators.DateGenerator;
import MyExamples.Program011GeoTreeTry.Generators.RandomWordNot;

import java.util.Random;

public class Person {
    private String name;
    private String surname;
    private String yearOfBirth;
    private boolean sex;

    /**
     * Создать человека
     * @param name        Имя
     * @param surname     Фамилия
     * @param yearOfBirth Дата рождения
     * @param sex         Укажите пол
     */
    public Person(String name, String surname, String yearOfBirth, String sex) {
        setName(name);
        setSurname(surname);
        setYearOfBirth(yearOfBirth);
        setSex(sex);
    }

    /**
     * Создать человека
     * @param name        Имя
     * @param surname     Фамилия
     * @param yearOfBirth Дата рождения Man
     */
    public Person(String name, String surname, String yearOfBirth) {
        setName(name);
        setSurname(surname);
        setYearOfBirth(yearOfBirth);
        this.sex = new Random().nextBoolean();
    }

    /** Создать человека
     * @param name Имя
     * @param surname Фамилия*/
    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
        setYearOfBirth(new DateGenerator().dateGenerator());
        this.sex = new Random().nextBoolean();
    }

    /** Создать человека
     * @param name Имя*/
    public Person(String name) {
        setName(name);
        setSurname(new RandomWordNot().randomName());
        setYearOfBirth(new DateGenerator().dateGenerator());
        this.sex = new Random().nextBoolean();
    }

    /** Создать человека. Конструктор по умолчанию, что бы не придумывать имена*/
    public Person() {
        setName(new RandomWordNot().randomName());
        setSurname(new RandomWordNot().randomName());
        setYearOfBirth(new DateGenerator().dateGenerator());
        this.sex = new Random().nextBoolean();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getYearOfBirth() {
        return this.yearOfBirth;
    }

    public void setSex(String sex) {
        char result = sex.toLowerCase().charAt(0);
        if (result == 'м' || result == 'm') this.sex = true;
        else this.sex = false;
    }

    public String getSex() {
        if (this.sex) {
            return "Мужчина";
        }
        return "Женщина";
    }

    @Override
    public String toString() {
        return String.format("\nИмя: %s Фамилия: %s Год рождения: %s Пол: %s", this.name, this.surname, this.yearOfBirth, getSex());
    }
}
