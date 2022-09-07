package MyExamples.Transformers.Ex02Gun;


public class Transformer {
    private Gun gunLeft;
    private Gun gunRight;

    protected Transformer(Gun gunLeft, Gun gunRight) {
        this.gunLeft = gunLeft;
        this.gunRight = gunRight;
    }

    protected void fire() {
        this.gunLeft.fire();
        this.gunRight.fire();
    }

    @Override
    public String toString() {
        return String.format("left handgun ammo left: %d right handgun ammo left: %d", this.gunLeft.getInfo(), this.gunRight.getInfo());
    }
}
