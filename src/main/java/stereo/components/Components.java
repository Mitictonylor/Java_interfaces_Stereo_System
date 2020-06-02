package stereo.components;

public abstract class Components {

    String make;
    String model;

    public Components(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
