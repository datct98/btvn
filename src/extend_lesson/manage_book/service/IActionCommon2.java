package extend_lesson.manage_book.service;

import java.util.Scanner;

public interface IActionCommon2 <T> {
    void insert(T object);
    void update(Scanner scanner, int id);
    void delete(int id);
}
