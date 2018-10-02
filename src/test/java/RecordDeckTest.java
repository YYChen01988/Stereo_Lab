import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {
    RecordDeck recordDeck;

    @Before
    public void setUp() throws Exception {
        this.recordDeck = new RecordDeck(10, 10,"Panasonic", "SoftVoice");
    }

    @Test
    public void checkIfPlay() {
        assertEquals("It is playing", recordDeck.play());
    }


    @Test
    public void canIncreaseVolume() {
        recordDeck.increaseVolume(2);
        assertEquals(12, recordDeck.getVolume());
    }

    @Test
    public void canSlowPlaySpeed() {
        recordDeck.slowPlaySpeed(2);
        assertEquals(8, recordDeck.getPlaySpeed());
    }

    @Test
    public void canDecreaseVolume() {
        recordDeck.decreaseVolume(1);
        assertEquals(9, recordDeck.getVolume());
    }

    @Test
    public void canFastPlaySpeed() {
        recordDeck.fastPlaySpeed(2);
        assertEquals(12, recordDeck.getPlaySpeed());
    }
}
