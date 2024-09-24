package extend_lesson.school.view;


import extend_lesson.school.data.DataBase;
import extend_lesson.school.service.StudentService;
import extend_lesson.school.utils.Utils;

import java.util.Scanner;

public class Menu {
    StudentService studentService = new StudentService();
    public void displayMenu(Scanner scanner){
        System.out.println("1- Nhập vào một danh sách gồm n học sinh ( n- nhập từ bàn phím)\n" +
                "2- Hiển thị ra màn hình tất cả những học sinh sinh năm 1985 và quê ở Thái Nguyên\n" +
                "3- Hiển thị ra màn hình tất cả những học sinh của lớp 10A1\n");
        System.out.println("Mời b lựa chọn:");
        selectMenu(scanner);
    }

    private void selectMenu(Scanner scanner){
        int choice = Utils.inputInteger(scanner);
        switch (choice){
            case 1:
                studentService.createStudent(scanner);
                System.out.println(DataBase.students);
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
