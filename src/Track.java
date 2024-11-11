public class Track extends Transport{
    private double cargoCapacity;

    public Track(String model, String color, double speed, double cargoCapacity) {
        super(model, color, speed);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "Track: \n" +
                super.toString()+"\n"+
                "cargo capacity:" + cargoCapacity +
                "\n______________________";
    }
}
