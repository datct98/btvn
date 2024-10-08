package extend_lesson.exceptionb.sale.view;

import extend_lesson.exceptionb.sale.data.DataBase;
import extend_lesson.exceptionb.sale.entity.Product;
import extend_lesson.exceptionb.sale.service.ProductService;
import extend_lesson.exceptionb.sale.utils.Utils;

import java.util.Scanner;

public class Menu {
    ProductService productService = new ProductService();
    public void displayMenuForSeller(Scanner scanner){
        System.out.println("1- Xem danh sách sản phẩm");
        System.out.println("2- Xem chi tiết sản phẩm");
        System.out.println("3- Thêm sản phẩm");
        System.out.println("4- Xóa sản phẩm");
        System.out.println("5- Filter");
        System.out.println("Mời bạn lựa chọn: ");
        chooseMenuSeller(scanner);
    }

    public void chooseMenuSeller(Scanner scanner){
        int choose = Utils.inputInteger(scanner);

        switch (choose){
            case 1:
                System.out.println( DataBase.products);
                break;
            case 2:
                break;
            case 3:
                Product product = productService.createProduct(scanner);
                DataBase.products.add(product);
                break;
            case 4:
                break;
            case 5:
                menuFilter(scanner);
                break;
            default:
                System.exit(0);
        }
    }

    public void menuFilter(Scanner scanner){
        System.out.println("1- Lọc theo Khu vực");
        System.out.println("2- Lọc theo giá sp:");
        System.out.println("Mời bạn lựa chọn: ");
        chooseMenuFilter(scanner);
    }

    private void chooseMenuFilter(Scanner scanner) {
        int choose = Utils.inputInteger(scanner);
        switch (choose){
            case 1:
                System.out.println("MỜi bạn chọn khu vực: 1- HN  2- HCM");
                int area = Utils.inputInteger(scanner);
                if(area == 1){
                    productService.filterProduct();
                } else if(area == 2){

                } else {

                }
                break;
            case 2:
                break;
            default:
        }
    }
}
