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
    public void canGetName() {
        assertEquals("MyStereo", stereo.getName());
    }



    @Test
    public void canTurnUp() {
        stereo.raiseVolume();
        assertEquals(11, stereo.getVolume());
    }

    @Test
    public void canTurnDown() {
        stereo.raiseVolume();
        stereo.raiseVolume();
        stereo.lowVolume();
        assertEquals(11, stereo.getVolume());
    }



    @Test
    public void cannotTurnSoundDownBelowZero() {
        stereo.raiseVolume();
        stereo.raiseVolume();
        assertEquals(12, stereo.getVolume());
        for (int i = 0; i < 13; i++) {
            stereo.lowVolume();
        }
        assertEquals(0, stereo.getVolume());
    }

    @Test
    public void canUseRadio() {
        String result = stereo.tuneRadio("Planet Rock");
        assertEquals("Radio chose is Planet Rock",result);
    }

    @Test
    public void canUseCDPlayer() {
        String result = stereo.playCd();
        assertEquals("play, play", result);
    }


}
