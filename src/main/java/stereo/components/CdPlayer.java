package stereo.components;

public class CdPlayer extends Components{

    private int numberOfCds;

    public CdPlayer(String make, String model, int numberOfCds) {
        super(make, model);
        this.numberOfCds = numberOfCds;
    }
}
