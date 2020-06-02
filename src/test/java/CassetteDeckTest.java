import org.junit.Before;
import org.junit.Test;
import stereo.components.CassetteDeck;
import stereo.components.Radio;

import static org.junit.Assert.assertEquals;

public class CassetteDeckTest {
    CassetteDeck cassetteDeck;

    @Before
    public void setUp(){
        cassetteDeck = new CassetteDeck("Sony","model1");
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", cassetteDeck.getMake());
    }
    @Test
    public void hasModel() {
        assertEquals("model1", cassetteDeck.getModel());
    }
    @Test
    public void canPlay() {
        assertEquals("play, play", cassetteDeck.play());
    }


}
