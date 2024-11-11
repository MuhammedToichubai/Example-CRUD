public class Car extends Transport{//// is a Transport
    private double capacity;

    public Car(String model, String color, double speed, double capacity) {
        super(model, color, speed);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Car: \n" +
                super.toString()+
                "capacity:" + capacity +
                "\n______________________";
    }
}
