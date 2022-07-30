package MyExamples.Program007TestArrayListAnotherType;

import java.util.ArrayList;

public class Check {
    private ArrayList<Beer> beers;

    public Check() {
        this.beers = null;
    }

    public void addBeer(Beer beer) {
        beers.add(beer);
    }
    public ArrayList<Beer> retArrayList() {
        return this.beers;
    }
}
