public class Bedroom{
    public String name;
    public Wall wall1;
    public Wall wall2;
    public Wall wall3;
    public Wall wall4;
    public Ceiling ceiling;
    public Bed bed;
    public Lamp lamp;
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }
    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed() {
        System.out.println("The bed is being made!");
        bed.make();
    }
}
