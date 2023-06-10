public class Town {
    private String name;
    private double distanceFromStart;

    public Town(String name, double distanceFromStart) {
        this.name = name;
        this.distanceFromStart = distanceFromStart;
    }

    public String toString() {
        return name + " (" + distanceFromStart + " km)";
    }

    public double getDistanceFromStart() {
        return distanceFromStart;
    }
}
