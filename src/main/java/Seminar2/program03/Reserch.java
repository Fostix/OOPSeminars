package Seminar2.program03;

import java.util.ArrayList;

public class Reserch {
    ArrayList<Node> tree;

    public Reserch(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public ArrayList<Person> spend(Person p, Relationship re) {

        ArrayList result = new ArrayList<Person>();

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
        System.out.println(result);
        return result;
    }
}