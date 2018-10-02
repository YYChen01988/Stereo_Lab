public abstract class Component {

    private int playSpeed;
    private int volume;
    private String make;
    private String model;



    public Component(int playSpeed, int volume, String make, String model) {
        this.playSpeed = 10;
        this.volume = 10;
        this.make = make;
        this.model = model;
    }

    public String play() {
        return "It is playing";
    }


    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getPlaySpeed() {
        return playSpeed;
    }

    public int getVolume() {
        return volume;
    }

    public void fastPlaySpeed(int playSpeedAmount) {
        if (playSpeed < 20){
            this.playSpeed += playSpeedAmount;
        }
    }

    public void slowPlaySpeed(int playSpeedAmount) {
        if (playSpeed > 0){
            this.playSpeed -= playSpeedAmount;
        }
    }

    public void increaseVolume(int volumeAmount) {
        if (this.volume < 20){
            this.volume += volumeAmount;
        }
    }

    public void decreaseVolume(int volumeAmount) {
        if (this.volume > 0){
            this.volume -= volumeAmount;
        }
    }


}
