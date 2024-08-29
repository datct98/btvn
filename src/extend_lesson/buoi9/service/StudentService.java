package extend_lesson.buoi9.service;

import extend_lesson.buoi9.entities.Student;

import java.util.List;
import java.util.Scanner;

public class StudentService {
    public Student insertStudent(Scanner scanner){
        System.out.println("Mời b nhập tên học viên");
        String name = scanner.nextLine();
        System.out.println("Học lực");
        String classify = scanner.nextLine();
        return  new Student(name, classify);
    }

    public void updateStudent(Scanner scanner, List<Student> students){
        Student existedStudent = findStudent(scanner, students);
        if(existedStudent != null){
            System.out.println("Mời b nhập học lực muốn đổi: ");
            String classify = scanner.nextLine();
            existedStudent.setClassify(classify);
        }
    }

    public void deleteStudent(Scanner scanner, List<Student> students){
        Student existedStudent = findStudent(scanner, students);
        if(existedStudent != null){
            students.remove(existedStudent);
        } else {
            System.out.println("Không tìm thấy hocjh viên có id trên ");
        }
    }

    private Student findStudent(Scanner scanner, List<Student> students){
        System.out.println("Mời b nhập id học viên muốn xóa:");
        int id = Integer.parseInt(scanner.nextLine());
        for (Student student: students){
            if(student.getId() == id){

                return student;
            }
        }
        return null;
    }
}
