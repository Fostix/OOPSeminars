package Seminar2.program01;

import java.util.ArrayList;

public class Pro {

    public static void main(String[] args) {
        var irina = new Seminar2.program02.Person("Ирина");
        var vasya = new Seminar2.program02.Person("Вася");
        var masha = new Seminar2.program02.Person("Маша");
        var jane = new Seminar2.program02.Person("Женя");
        var ivan = new Seminar2.program02.Person("Ваня");

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        System.out.println(new Reserch(gt).spend(masha, Relationship.parent));

    }

}

enum Relationship {
    parent,
    children
}

class Person {

    public String fullName;

    public String getFullName() {
        return fullName;
    }

    public Person(String fullName) {
        this.fullName = fullName;
    }

}

class Node {

    public Node(Seminar2.program02.Person p1, Relationship re, Seminar2.program02.Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    Seminar2.program02.Person p1;
    Relationship re;
    Seminar2.program02.Person p2;

    @Override
    public String toString() {
        return String.format("<%s %s %s>", p1, re, p2);
    }
}

class GeoTree {
    private ArrayList<Node> tree = new ArrayList<>();

    public ArrayList<Node> getTree() {
        return tree;
    }

    public void append(Seminar2.program02.Person parent, Seminar2.program02.Person children) {

        tree.add(new Node(parent, Relationship.parent, children));
        tree.add(new Node(children, Relationship.children, parent));
    }
}

class Reserch {
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<Seminar2.program02.Person> spend(Seminar2.program02.Person p, Relationship re) {

        var result = new ArrayList<Seminar2.program02.Person>();

        // tree.forEach((t) -> {
        // if (t.p1.fullName == p.fullName
        // && t.re == re) {
        // result.add(t.p2);
        // }
        // });

        for (Node t : tree) {
            if (t.p1.fullName == p.fullName
                    && t.re == re) {
                result.add(t.p2);
            }
        }

        return result;
    }
}

class Printer {

}
