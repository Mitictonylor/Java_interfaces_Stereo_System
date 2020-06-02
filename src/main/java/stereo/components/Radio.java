package stereo.components;

public class Radio extends Components{


    public Radio(String make, String model, int volume) {
        super(make, model, volume);
    }


    public String tune(String nameOfRadio){
        return nameOfRadio;
    }
}
