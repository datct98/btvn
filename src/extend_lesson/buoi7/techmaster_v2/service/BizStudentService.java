package extend_lesson.buoi7.techmaster_v2.service;

import extend_lesson.buoi7.techmaster_v2.entities.BizStudent;

import java.util.Scanner;

public class BizStudentService {
    public BizStudent inputBizStudent(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập chuyên ngành: ");
        String major = scanner.nextLine();
        System.out.println("Mời b nhập điểm marketing: ");
        double marketing = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm sale: ");
        double sale = Double.parseDouble(scanner.nextLine());

        return new BizStudent(name, major, marketing, sale);
    }
}
