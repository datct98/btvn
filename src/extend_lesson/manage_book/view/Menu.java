package extend_lesson.manage_book.view;

import extend_lesson.manage_book.service.BookService;
import extend_lesson.manage_book.service.PersonService;
import extend_lesson.manage_book.service.TicketBookService;
import extend_lesson.manage_book.utils.Utils;

import java.util.Scanner;

public class Menu {
     PersonService personService = new PersonService();
     BookService bookService = BookService.getInstance();
    TicketBookService ticketBookService = new TicketBookService();

    public void displayMenu(Scanner scanner){
        System.out.println("1- Quản lý độc giả");
        System.out.println("2- Quản lý Sách");
        System.out.println("1- Quản lý Phiếu mượn trả sách");
        System.out.println("Mời b lựa chọn");
    }

    public void displayMenuManageCustomer(Scanner scanner){
        System.out.println("1- Thêm");
        System.out.println("1- Sửa");
        System.out.println("1- Xóa");
        System.out.println("Mời b lựa chọn");
    }

    public void selectMenuManageCustomer(Scanner scanner){
        int choice = Utils.inputInteger(scanner);
        switch (choice){
            case 1:
                personService.insert(scanner);
                break;
            case 2:
                break;
            case 3:
                break;

        }
    }

    public void selectMenuManageBook(Scanner scanner){
        int choice = Utils.inputInteger(scanner);
        switch (choice){
            case 1:
                bookService.insert(scanner);
                break;
            case 2:
                break;
            case 3:
                break;

        }
    }

    public void selectMenuManageTicketBook(Scanner scanner){
        int choice = Utils.inputInteger(scanner);
        switch (choice){
            case 1:
                ticketBookService.insertTicket(scanner);
                break;
            case 2:
                break;
            case 3:
                break;

        }
    }
}
