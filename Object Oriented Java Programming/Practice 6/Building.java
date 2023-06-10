public class Building implements Mappable {
    private String name;
    private UsageType type;

    public Building(String name, UsageType type) {
        this.name = name;
        this.type = type;
    }

    public String getLabel() {
        return name + " (" + type + ")";
    }

    public Geometry getShape() {
        return Geometry.POINT;
    }

    public String getMarker() {
        return String.format(Color.RED + " " + PointMarkers.STAR);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return String.format("" + type);
    }
}