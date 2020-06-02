package stereo.components;

public abstract class Components {

    String make;
    String model;
    int volume;

    public Components(String make, String model, int volume) {
        this.make = make;
        this.model = model;
        this.volume = volume;
    }


    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
