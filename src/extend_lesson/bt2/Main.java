package extend_lesson.bt2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Address: ");
        String address = scanner.nextLine();
        System.out.println("age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("exp: ");
        double exp = Double.parseDouble(scanner.nextLine());
        System.out.println("Place: ");
        String place = scanner.nextLine();
        Employee dat = new Employee(id, address, age, exp, place);
        System.out.println(dat);
    }
}
