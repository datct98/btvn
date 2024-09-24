package extend_lesson.school;

import extend_lesson.school.view.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.displayMenu(new Scanner(System.in));
    }
}
