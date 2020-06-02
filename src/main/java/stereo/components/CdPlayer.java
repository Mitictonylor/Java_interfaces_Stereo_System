package stereo.components;

public class CdPlayer extends Components{

    private int numberOfCds;

    public CdPlayer(String make, String model, int numberOfCds) {
        super(make, model);
        this.numberOfCds = numberOfCds;
    }

    public int getNumberOfCds() {
        return this.numberOfCds;
    }

    public void setNumberOfCds(int numberOfCds) {
        this.numberOfCds = numberOfCds;
    }
}
