import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập giá trị a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Hãy nhập giá trị b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Hãy nhập giá trị c: ");
        double c = Double.parseDouble(scanner.nextLine());

        if(a !=0){
            double denta = Math.pow(b, 2) - 4*a*c;
            if(denta< 0){
                System.out.println("PT vn");
            } else if (denta == 0 ){
                double x = -b/(2*a);
            } else {
                double x1 = (-b + Math.sqrt(denta)) /(2*a);
                double x2 = (-b - Math.sqrt(denta)) /(2*a);
            }
        } else {
            System.out.println("Giải pt b1");
        }

    }
}
