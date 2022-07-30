package MyExamples.Program15UsersWithID;

public class Users { // id create in new class? how check on original?
    private Id id;
    private String name;
    private String surname;
    public Users(String name, String surname) {
        this.id = new Id();
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s", id.getId(), this.name, this.surname);
    }
}
