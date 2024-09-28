package extend_lesson.manage_book.service;

import extend_lesson.manage_book.data.Database;
import extend_lesson.manage_book.entities.Person;
import extend_lesson.manage_book.entities.TicketBook;
import extend_lesson.manage_book.utils.Utils;

import java.util.Scanner;

public class TicketBookService {
    BookService bookService = BookService.getInstance();
    PersonService personService = new PersonService();

    public void insertTicket(Scanner scanner){
        System.out.println("Mời b nhập mã người mượn: ");
        int idPerson = Utils.inputInteger(scanner);
        if(personService.findById(idPerson) ==null){
            // Thông báo lỗi và yêu cầu nhập lại
        }
        System.out.println("Mời b nhập mã sách mượn: ");
        int idBook = Utils.inputInteger(scanner);
        // Kiểm tra id có tồn tại hay k
        if(bookService.findById(idBook) == null){
            // Thông báo lỗi và yêu cầu nhập lại
        }
        System.out.println("Mời b nhập số lượng: ");
        int quantity = Utils.inputInteger(scanner);
        // Kiểm tra số lượng trong kho có đủ hay k
        boolean updateQuantity = bookService.updateQuantity(quantity, idBook);
        if(!updateQuantity){
            // Thông báo update thất bại
        } else {
            TicketBook ticketBook = new TicketBook( idBook, idPerson, quantity);
            Database.tickets.add(ticketBook);
        }
    }
}
