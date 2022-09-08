package MyExamples.Program011GeoTreeTry;

import java.util.ArrayList;
import java.util.List;

public class GeoTree {
    private Person whose;
    private List<Relatives> geoTree = new ArrayList<>();

    public GeoTree(Person whose) {
        this.whose = whose;
    }

    public void append(Relatives relatives) {
        this.geoTree.add(relatives);
    }

    @Override
    public String toString() {
        return String.format("чьё семейное древо:%s%s", this.whose, this.geoTree)
                        .replace(",", "").replace("[","")
                .replace("]","");
    }
}
