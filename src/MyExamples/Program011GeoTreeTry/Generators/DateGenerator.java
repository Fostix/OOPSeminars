package MyExamples.Program011GeoTreeTry.Generators;

import java.util.GregorianCalendar;

public class DateGenerator {
    public String dateGenerator() {
        GregorianCalendar gc = new GregorianCalendar();
        int year = randBetween(1900, 2021);
        gc.set(gc.YEAR, year);
        int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
        gc.set(gc.DAY_OF_YEAR, dayOfYear);
        return String.format("%d.%d.%d",
                gc.get(gc.YEAR), (gc.get(gc.MONTH) + 1), gc.get(gc.DAY_OF_MONTH));
    }

    public int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }
}
