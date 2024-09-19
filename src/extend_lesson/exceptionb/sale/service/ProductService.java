package extend_lesson.exceptionb.sale.service;

import extend_lesson.exceptionb.sale.entity.Product;
import extend_lesson.exceptionb.sale.utils.Utils;

import java.util.Scanner;

public class ProductService {
    public Product createProduct(Scanner scanner){
        System.out.println("Mời b nhập tên sp: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập số lượng sp: ");
        int quantity = Utils.inputInteger(scanner);


        System.out.println("Mời b giá lượng sp: ");
        double price = Utils.inputDouble(scanner);

        return new Product(quantity, name, price);
    }
}
