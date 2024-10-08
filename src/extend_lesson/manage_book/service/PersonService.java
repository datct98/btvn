package extend_lesson.manage_book.service;

import extend_lesson.manage_book.data.Database;
import extend_lesson.manage_book.entities.Person;

import java.util.Scanner;

public class PersonService implements IActionCommon{

    public Person findById(int id){
        for (Person person: Database.people){
            if(person.getId()== id){
                return person;
            }
        }
        return null;
    }

    @Override
    public void insert(Scanner scanner) {
        System.out.println("Mời b nhập tên độc giả: ");
        String name =scanner.nextLine();
        String phone =scanner.nextLine();
        Person person = new Person(name, phone);
        Database.people.add(person);
    }


    @Override
    public void update(Scanner scanner, int id) {
        System.out.println("Mời b nhập tên mới cho người đọc: ");
        String newName = scanner.nextLine();
        System.out.println("Mời b nhập số đt mới cho người đọc: ");
        String newPhone = scanner.nextLine();
        Person person = findById(id);
        if(person == null){
            // Thông báo lỗi
        } else {
            person.setName(newName);
            person.setPhone(newPhone);
        }
    }

    @Override
    public void delete(int id) {

    }

}
