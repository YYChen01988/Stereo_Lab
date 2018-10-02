import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {
    Mp3Player mp3Player;
    Stereo stereo;

    Radio radio;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;

    @Before
    public void setUp() throws Exception {
        this.mp3Player = new Mp3Player();
        radio = new Radio("Radio 1");
        cdPlayer = new CDPlayer(10,10,"Panasonic","888", 6);
        recordDeck = new RecordDeck(10, 10, "Sony", "Yes");
        this.stereo = new Stereo(radio, cdPlayer, recordDeck, "Apple");
    }

    @Test
    public void canConnect() {
        assertEquals("It is connected to Apple", mp3Player.connect(stereo));

    }
}
