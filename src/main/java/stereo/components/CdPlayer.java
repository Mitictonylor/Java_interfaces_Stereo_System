package stereo.components;

public class CdPlayer extends Components implements IPlay{

    private int numberOfCds;

    public CdPlayer(String make, String model, int volume, int numberOfCds) {
        super(make, model, volume);
        this.numberOfCds = numberOfCds;
    }

    public int getNumberOfCds() {
        return this.numberOfCds;
    }

    public void setNumberOfCds(int numberOfCds) {
        this.numberOfCds = numberOfCds;
    }

    public String play() {
        return "play, play";
    }
}
