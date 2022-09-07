package Seminar1.program03;

class Person {
    private static int count;
    private int id;
    private String name;
    private String surname;

    static {
        count = 0;
    }

    /**
     * Hi
     */
    public Person(int id, String name, String surname) {
        count++;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Person() {
        count++;
        this.id = 123;
        this.name = "don't written";
        this.surname = "don't written";
    }

    public int printId() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("id: %d, name: %s, surname: %s", this.id, this.name, this.surname);
        // return id.toString();
    }
}
