import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;

    @Before
    public void setUp() {
        radio = new Radio("Radio 1");
        cdPlayer = new CDPlayer(10,10,"Panasonic","888", 6);
        recordDeck = new RecordDeck(10, 10, "Sony", "Yes");
        stereo = new Stereo(radio, cdPlayer, recordDeck, "Apple");
    }

    @Test
    public void canGetRadioTune() {
        stereo.tuneRadio("Radio 3");
        assertEquals("Radio 3", stereo.getRadio().getStation());
    }

    @Test
    public void canIncreaseCdPlayerVolume() {
        stereo.turnUpCdPlayer(1);
        assertEquals(11, stereo.getCdPlayer().getVolume());
    }
}
