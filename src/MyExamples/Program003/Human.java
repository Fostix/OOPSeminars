package MyExamples.Program003;

public class Human {
    String Name;
    int salary;
    int experience;

    Human(String name) {
        Name = name;
    }


    int calcSalary() {
        return salary*(1+experience/5);
    }
}
