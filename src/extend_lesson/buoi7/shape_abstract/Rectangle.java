package extend_lesson.buoi7.shape_abstract;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public void printInfo() {
        System.out.println("");
    }

    @Override
    public double calculateArea() {
        return length*width;
    }

    @Override
    public double calculatePer() {
        return 0;
    }
}
