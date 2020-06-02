package stereo;

import stereo.IConnect;
import stereo.Stereo;
import stereo.components.Components;

public class Mp3Player  implements IConnect {

    private String make;
    private String model;

    public Mp3Player(String make, String model) {
       this.make = make;
       this.model = model;
    }

    public String connect(Stereo stereo){
        return "The device is connected to " + stereo.getName();
    }
}
