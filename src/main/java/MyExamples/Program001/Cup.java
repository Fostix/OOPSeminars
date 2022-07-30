package MyExamples.Program001;


public class Cup { // чашка.
    private final float capacity; // ёмкость. // final константа!!
    private float liter; // наполненность.


    /** Cup чашка
     * @param capacity Ёмкость.
     * @param liter На сколько наполнена.
     * */
    protected Cup(float capacity, float liter) {
        this.capacity = capacity;
        this.liter = liter;
    }
    /** Cup чашка
     * @param capacity Ёмкость.
     * */
    protected Cup(float capacity) {
        this.capacity = capacity;
        this.liter = 0F;
    }

    /** Cup чашка*/
    protected Cup() {
        this.capacity = 0.5F;
        this.liter = 0F;
    }

    protected void cupFillingOneMilliliter() {
        this.liter += 0.1F;
        if(this.liter > this.capacity) {
            System.out.println("Water spelled"); // Вода пролита.
        }
    }





    @Override
    public String toString() {
        return String.format("capacity: %.1f, liter: %.1f\n", this.capacity, this.liter);
    }
}
