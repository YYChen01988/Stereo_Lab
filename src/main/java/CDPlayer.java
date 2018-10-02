public class CDPlayer extends Component {


        private int cdCapacity;

        public CDPlayer(int playSpeed, int volume, String make, String model, int cdCapacity) {
        super(playSpeed, volume, make, model);

        this.cdCapacity = cdCapacity;
    }

    public int getCdCapacity() {
        return cdCapacity;
    }
}
