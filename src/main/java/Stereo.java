public class Stereo {
    Radio radio;
    CDPlayer cdPlayer;
    RecordDeck recordDeck;
    String name;

    public Stereo(Radio radio, CDPlayer cdPlayer, RecordDeck recordDeck, String name) {
        this.radio = radio;
        this.cdPlayer = cdPlayer;
        this.recordDeck = recordDeck;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Radio getRadio() {
        return radio;
    }

    public void tuneRadio(String station){
        this.radio.tune(station);
    }






    public CDPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void turnUpCdPlayer(int volumeAmount) {
        cdPlayer.increaseVolume(volumeAmount);
    }





    public RecordDeck getRecordDeck() {
        return recordDeck;
    }


}
