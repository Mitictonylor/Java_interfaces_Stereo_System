package stereo.device;

import stereo.IConnect;
import stereo.Stereo;

public class Speaker implements IConnect {

    public String connect(Stereo stereo){
        return "The device is connected to " + stereo.getName();
    }
}
