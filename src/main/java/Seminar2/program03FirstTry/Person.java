package Seminar2.program03FirstTry;

public class Person {
    private String name;
    private String surname;
    private String dateOfBorn;
    private boolean gender;
    private ChildList child;


    /** выаыва
     * @param name
     * @param surname
     * @param dateOfBorn
     * @param gender
     *
     * */
    public Person(String name, String surname, String dateOfBorn, boolean gender, ChildList child) {
        this.name = name;
        this.surname = surname;
        this.dateOfBorn = dateOfBorn;
        this.gender = gender;
        this.child = child;
    }

    public Person(String name, String surname, String dateOfBorn, boolean gender) {
        this.name = name;
        this.surname = surname;
        this.dateOfBorn = dateOfBorn;
        this.gender = gender;
        this.child = null;
    }

    public Person(String name, String surname, String dateOfBorn, boolean gender, Person l) {
        this.name = name;
        this.surname = surname;
        this.dateOfBorn = dateOfBorn;
        this.gender = gender;
    }


    @Override
    public String toString() {
        //if(ChildList)
        return String.format("name: %s\nsurname: %s\ndate of born: %s\ngender: %b\n", this.name, this.surname, this.dateOfBorn, this.gender);
    }
}
