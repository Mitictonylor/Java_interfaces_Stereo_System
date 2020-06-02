import org.junit.Before;
import org.junit.Test;
import stereo.components.Radio;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void setUp(){
        radio = new Radio("Sony","model1",10);
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
    @Test
    public void hasVolume() {
        assertEquals(10, radio.getVolume());
    }
    @Test
    public void canSetPlay() {
        radio.setVolume(15);
        assertEquals(15, radio.getVolume());
    }
}
