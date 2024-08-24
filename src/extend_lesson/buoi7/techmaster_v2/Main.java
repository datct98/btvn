package extend_lesson.buoi7.techmaster_v2;

import extend_lesson.buoi7.techmaster_v2.entities.BizStudent;
import extend_lesson.buoi7.techmaster_v2.service.BizStudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BizStudentService bizStudentService = new BizStudentService();
        BizStudent bizStudent = bizStudentService.inputBizStudent(scanner);
        System.out.println(bizStudent);

    }
}
