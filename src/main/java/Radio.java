public class Radio {

    public String station;

    public Radio(String station) {
        this.station = station;
    }

    public String getStation() {
        return station;
    }

    public void tune(String station) {
        this.station = station;
    }

    public String play(){
        return "I am playing";
    }
}
