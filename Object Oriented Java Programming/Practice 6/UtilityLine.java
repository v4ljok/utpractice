public class UtilityLine implements Mappable {
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    public String getLabel() {
        return name + " (" + type + ")";
    }

    public Geometry getShape() {
        return Geometry.LINE;
    }

    public String getMarker() {
        return String.format(Color.GREEN + " " + LineMarkers.DOTTED);
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