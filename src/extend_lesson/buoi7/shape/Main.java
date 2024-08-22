package extend_lesson.buoi7.shape;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 2);

        Square square = new Square(6);
        // Thực hiện set giá trị cho cv và diện tích
        rectangle.setPerimeter((rectangle.getLength() + rectangle.getWidth())*2);
        square.setPerimeter(square.getSide()*4);
        System.out.println("Chu vi hình chữ nhật là: "+ rectangle.getPerimeter());
        System.out.println("Chu vi hình vuông là: "+ square.getPerimeter());

        Rectangle1 rectangleClone = new Rectangle1(5, 2);
        Square1 squareClone = new Square1(5);
        double perHCN =rectangleClone.calculatePerimeter(rectangleClone.getLength(), rectangle.getWidth());
        System.out.println(perHCN);
        double perHV = squareClone.calculatePerimeter(squareClone.getSide(), squareClone.getSide());

    }
}
