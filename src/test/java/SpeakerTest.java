
import org.junit.Before;
import org.junit.Test;
import stereo.device.Speaker;

import static org.junit.Assert.assertEquals;

public class SpeakerTest {
   Speaker speaker;

    @Before
    public void before() {
        speaker = new Speaker();
    }


    @Test
    public void canBlastOutSounds() {
        assertEquals("Playing music", speaker.sound("music"));
    }
}
