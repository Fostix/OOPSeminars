package Homeworks.ClosetInteractoin;

public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s", this.name);
    }
}
