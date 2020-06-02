package stereo.components;

public class CassetteDeck extends Components implements IPlay{

    public CassetteDeck(String make, String model) {
        super(make, model);
    }

    public String play() {
        return "playplay";

    }
}
