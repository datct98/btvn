package extend_lesson.exceptionb.sale;

import extend_lesson.exceptionb.sale.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        do {
            menu.displayMenuForSeller(scanner);
        } while (true);

    }
}
