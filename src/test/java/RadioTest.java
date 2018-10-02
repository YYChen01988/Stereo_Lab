import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RadioTest {
    Radio radio;

    @Before
    public void setUp() throws Exception {
        this.radio = new Radio("Radio 1");
    }

    @Test
    public void canPlay() {
        assertEquals("I am playing", radio.play());
    }

    @Test
    public void canGetStation() {
        assertEquals("Radio 1", radio.getStation());
    }

    @Test
    public void canTune() {
        radio.tune("Radio 2");
        assertEquals("Radio 2", radio.getStation());
    }
}
