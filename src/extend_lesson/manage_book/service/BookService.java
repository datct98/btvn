package extend_lesson.manage_book.service;

import extend_lesson.manage_book.data.Database;
import extend_lesson.manage_book.entities.Book;
import extend_lesson.manage_book.utils.Utils;

import java.util.Scanner;

public class BookService implements IActionCommon{
    private static BookService bookService;
    private BookService() {
    }

    public static synchronized BookService getInstance(){
        if(bookService == null){
            bookService = new BookService();
        }
        return bookService;
    }

    public Book findById(int id){
        for (Book book: Database.books){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }

    public boolean updateQuantity(int quantity, int id){
        Book book = findById(id);
        if(book == null){
            // Thông báo lỗi
            return false;
        } else {
            int quantityAfter = book.getQuantity() - quantity;
            if(quantityAfter<0){
                // báo lỗi
                return false;
            } else {
                book.setQuantity(quantityAfter);
                return true;
            }
        }
    }

    @Override
    public void insert(Scanner scanner) {
        Book book = inputInfo(scanner);
        Database.books.add(book);
    }

    private Book inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên sách: ");
        String name =scanner.nextLine();
        System.out.println("Mời b nhập SL sách: ");
        int quantity = Utils.inputInteger(scanner);
        Book book = new Book(name, quantity);
        return book;
    }



    @Override
    public void update(Scanner scanner, int id) {
        System.out.println("Mời b nhập tên mới cho sách: ");
        String newName = scanner.nextLine();
        System.out.println("Mời b nhập số lượng mới: ");
        int quantity = Utils.inputInteger(scanner);
        Book book = findById(id);
        if(book == null){
            // Thông báo lỗi
        } else {
            book.setName(newName);
            book.setQuantity(quantity);
        }
    }


    @Override
    public void delete(int id) {

    }
}
