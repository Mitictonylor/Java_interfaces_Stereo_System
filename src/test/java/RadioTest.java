import org.junit.Before;
import org.junit.Test;
import stereo.components.Radio;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void setUp(){
        radio = new Radio("Sony","model1");
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("model1", radio.getModel());
    }

    @Test
    public void canShowTheRadioStation() {
        assertEquals("Radio1", radio.tune("Radio1"));
    }
}
