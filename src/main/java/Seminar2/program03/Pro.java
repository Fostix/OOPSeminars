package Seminar2.program03;


public class Pro {

    public static void main(String[] args) {
        var irina = new Person("Ирина");
        var vasya = new Person("Вася");
        var masha = new Person("Маша");
        var jane = new Person("Женя");
        var ivan = new Person("Ваня");

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        System.out.println(new Reserch(gt).spend(irina, Relationship.parent));

    }

}












