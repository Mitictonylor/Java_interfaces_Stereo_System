import org.junit.Before;
import org.junit.Test;
import stereo.components.Radio;
import stereo.components.RecordDeck;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {
    RecordDeck recordDeck;

    @Before
    public void setUp(){
        recordDeck = new RecordDeck("Sony","model1", 4);
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("model1", recordDeck.getModel());
    }

    @Test
    public void hasPlaySpeed() {
        assertEquals(4, recordDeck.getPlaySpeed());
    }
    @Test
    public void canSetPlaySpeed() {
        recordDeck.setPlaySpeed(3);
        assertEquals(3, recordDeck.getPlaySpeed());
    }
}
