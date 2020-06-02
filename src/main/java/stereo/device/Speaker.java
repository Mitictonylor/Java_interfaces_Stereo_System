package stereo.device;

import stereo.IConnect;
import stereo.Stereo;

public class Speaker implements IOutput {

    public String sound(String sound){
        return "Playing " + sound ;
    }
}
