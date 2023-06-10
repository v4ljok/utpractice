public class Rectangle {
    public double width;
    public double length;
    public Rectangle(double width, double length) {
        if (width < 0) {
            this.width = 0;
            this.length = length;
        }
        else if (length < 0) {
            this.length = 0;
            this.width = width;
        }
        else {
            this.length = length;
            this.width = width;
        }
    }
    public double getWidth() {
        return width;
    }
    public double getLength() {
        return length;
    }
    public double getArea() {
        return width * length;
    }
}
