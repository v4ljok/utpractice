public class Main {
    public static void main(String[] args) {
        Building building = new Building("Narva Town Hall", UsageType.GOVERNMENT);
        UtilityLine utilityLine = new UtilityLine("Raekoja plats", UtilityType.FIBER_OPTIC);

        Mappable.mapIt(building);
        Mappable.mapIt(utilityLine);;
    }
}
