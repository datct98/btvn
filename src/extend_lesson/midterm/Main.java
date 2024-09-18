package extend_lesson.midterm;

import extend_lesson.midterm.entities.User;
import extend_lesson.midterm.view.Menu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);
        menu.displayPreLogin(scanner);
    }
}
