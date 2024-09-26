package extend_lesson.relationship;

import extend_lesson.relationship.entities.Student;
import extend_lesson.relationship.service.StudnetService;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*StudnetService service = new StudnetService();
        System.out.println("Thêm học sinh vào lớp: ");
        System.out.println("Mời b nhập id lớp học: ");
        int classId = scanner.nextInt();
        System.out.println("Mời b nhập id  học sinh: ");
        int studentId = scanner.nextInt();
        Student student = service.findById(studentId);
        student.setClassId(classId);
        service.displayStudentInfo(student);*/
        System.out.println("Mời b nhập vào số tiền: ");
        BigDecimal price = new BigDecimal(scanner.nextLine());
        BigDecimal price2 = new BigDecimal(scanner.nextLine());
        System.out.println(price.add(price2));
    }
}
