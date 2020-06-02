package stereo.components;

public class CassetteDeck extends Components implements IPlay{


    public CassetteDeck(String make, String model, int volume) {
        super(make, model, volume);
    }

    public String play() {
        return "play, play";

    }
}
