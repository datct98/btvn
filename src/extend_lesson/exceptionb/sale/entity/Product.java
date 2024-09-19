package extend_lesson.exceptionb.sale.entity;

public class Product {
    private static int autoId;
    private String id;
    private int quantity;
    private String name;
    private double price;

    public Product(int quantity, String name, double price) {
        this.id = "P"+ ++autoId;
        this.quantity = quantity;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", quantity=" + quantity +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
