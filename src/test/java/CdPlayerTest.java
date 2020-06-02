import org.junit.Before;
import org.junit.Test;
import stereo.components.CdPlayer;

import static org.junit.Assert.assertEquals;

public class CdPlayerTest {
    CdPlayer cdPlayer;

    @Before
    public void setUp(){
        cdPlayer = new CdPlayer("Sony","model1", 4);
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("model1", cdPlayer.getModel());
    }

    @Test
    public void hasNumberOfCds() {
        assertEquals(4, cdPlayer.getNumberOfCds());
    }
    @Test
    public void canSetNumberOfCds() {
        cdPlayer.setNumberOfCds(3);
        assertEquals(3, cdPlayer.getNumberOfCds());
    }
    @Test
    public void canPlay() {
        assertEquals("play, play", cdPlayer.play());
    }
}
