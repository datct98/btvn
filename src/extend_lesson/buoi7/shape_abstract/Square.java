package extend_lesson.buoi7.shape_abstract;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }



    @Override
    public void printInfo() {
        System.out.println();
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePer() {
        return 0;
    }
}
