public class Sensor {
    private String location;
    private double reading;
    public Sensor(String location, double reading) {
        this.location = location;
        if (reading < -50.0 || reading > 50.0) {
            this.reading = 0.0;
        } else {
            this.reading = reading;
        }
    }
    public String getLocation() {
        return location;
    }
    public double getReading() {
        return reading;
    }
}