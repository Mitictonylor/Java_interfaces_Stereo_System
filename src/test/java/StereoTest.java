import org.junit.Before;
import org.junit.Test;
import stereo.Stereo;
import stereo.components.CassetteDeck;
import stereo.components.CdPlayer;
import stereo.components.Radio;
import stereo.components.RecordDeck;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    CdPlayer cdplayer;
    Radio radio;
    RecordDeck recordDeck;
    CassetteDeck cassetteDeck;
    Stereo stereo;

    @Before
    public void setUp(){
        cdplayer = new CdPlayer("Sony","model1",  4);
        radio = new Radio("JVC", "model2");
        recordDeck = new RecordDeck("Bose", "model3", 3);
        cassetteDeck = new CassetteDeck("Panasonic","model4");
        stereo = new Stereo("MyStereo",cdplayer,radio,recordDeck,cassetteDeck,10);
    }

    @Test
    public void hasName() {
        assertEquals("MyStereo", stereo.getName());
    }
}
