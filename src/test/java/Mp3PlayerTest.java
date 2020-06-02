import org.junit.Before;
import org.junit.Test;
import stereo.Stereo;
import stereo.components.CassetteDeck;
import stereo.components.CdPlayer;
import stereo.components.Radio;
import stereo.components.RecordDeck;
import stereo.device.Mp3Player;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {

    Mp3Player mp3Player;
    Stereo stereo;
    CdPlayer cdplayer;
    Radio radio;
    RecordDeck recordDeck;
    CassetteDeck cassetteDeck;

    @Before
    public void setUp(){
        cdplayer = new CdPlayer("Sony","model1",  4);
        radio = new Radio("JVC", "model2");
        recordDeck = new RecordDeck("Bose", "model3", 3);
        cassetteDeck = new CassetteDeck("Panasonic","model4");
        stereo = new Stereo("MyStereo",cdplayer,radio,recordDeck,cassetteDeck);
        mp3Player = new Mp3Player();
    }

    @Test
    public void canGetConnectionName() {
        assertEquals("The device is connected to MyStereo", mp3Player.connect(stereo));
    }




}
