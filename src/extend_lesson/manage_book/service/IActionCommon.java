package extend_lesson.manage_book.service;

import java.util.Scanner;

public interface IActionCommon {
    void insert(Scanner scanner);
    void update(Scanner scanner, int id);
    void delete(int id);
}
