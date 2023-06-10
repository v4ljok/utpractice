public interface Mappable {
    String JSON_PROPERTY = "\"properties\": {%s}";
    String getLabel();
    Geometry getShape();
    String getMarker();
    String getName();
    String getType();

    default String toJSON() {
        return String.format(JSON_PROPERTY, "\"type\": \"" + getShape() + "\", \"label\": \"" + getLabel() + "\", \"marker\": \"" + getMarker() + "\", \"name\": \"" + getName() + "\", \"type\": \"" + getType() + "\"");
    }

    static void mapIt(Mappable mappable) {
        System.out.println(mappable.toJSON());
    }
}