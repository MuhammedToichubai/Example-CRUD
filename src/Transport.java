public class Transport {
    private String model;
    private String color;
    private double speed;

    public Transport(String model, String color, double speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return String.format("""
                model: %s,
                color: %s,
                speed: %f
                """, model, color, speed);
    }
}
