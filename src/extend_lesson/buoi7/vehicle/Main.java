package extend_lesson.buoi7.vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào quãng đường: ");
        double s = scanner.nextDouble();
        Bus bus = new Bus();
        double tBus = bus.calculateTime(s);
        System.out.println(tBus);
    }
}
