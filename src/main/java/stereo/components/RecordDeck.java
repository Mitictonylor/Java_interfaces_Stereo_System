package stereo.components;

public class RecordDeck extends Components{

    private int playSpeed;

    public RecordDeck(String make, String model, int playSpeed) {
        super(make, model);
        this.playSpeed = playSpeed;
    }

    public int getPlaySpeed() {
        return this.playSpeed;
    }

    public void setPlaySpeed(int playSpeed) {
        this.playSpeed = playSpeed;
    }
}
