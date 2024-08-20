package extend_lesson.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thoogn tin id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập thoogn tin tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập thoogn tin giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        // Cách 1:
        Pproduct pproduct = new Pproduct();
        pproduct.setName(name);
        pproduct.setId(id);
        pproduct.setPrice(price);
        // Cách 2:
        Pproduct pproduct2 = new Pproduct(id, name, price);

        // Tính thuế:
        calculateVAT(pproduct.getPrice());
        // Tính thuế:
        double vat = calculateVAT2(pproduct2.getPrice());
        System.out.println("VAT: "+vat);
    }

    // Cách 1:
    public static void calculateVAT(double price){
        double vatAmt = 0.1* price;
        System.out.println("VAT: "+ vatAmt);
    }

    // Cách 2:
    public static double calculateVAT2(double price){
        double vatAmt = 0.1* price;
        return vatAmt;
    }
}
