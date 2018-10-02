import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void setUp() throws Exception {
        this.cdPlayer = new CDPlayer(10,10, "Panasonic", "SoftVoice", 8);
        cdPlayer.play();
    }

    @Test
    public void checkIfPlay() {
        assertEquals("It is playing", cdPlayer.play());
    }

    @Test
    public void canIncreaseVolume() {
        cdPlayer.increaseVolume(2);
        assertEquals(12, cdPlayer.getVolume());
    }

    @Test
    public void canDecreaseVolume() {
        cdPlayer.decreaseVolume(1);
        assertEquals(9, cdPlayer.getVolume());
    }

    @Test
    public void canSlowPlaySpeed() {
        cdPlayer.slowPlaySpeed(2);
        assertEquals(8, cdPlayer.getPlaySpeed());
    }

    @Test
    public void canFastPlaySpeed() {
        cdPlayer.fastPlaySpeed(2);
        assertEquals(12, cdPlayer.getPlaySpeed());
    }

    @Test
    public void canGetCdCapacity() {
        assertEquals(8, cdPlayer.getCdCapacity());
    }
}
