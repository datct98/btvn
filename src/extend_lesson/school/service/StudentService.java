package extend_lesson.school.service;

import extend_lesson.school.data.DataBase;
import extend_lesson.school.entities.Student;
import extend_lesson.school.utils.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    public void createStudent(Scanner scanner){
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Mời b nhập số lượng hs muốn thêm: ");
        int n = Utils.inputInteger(scanner);
        for (int i = 0; i < n; i++) {
            System.out.println("Mời b nhập tên HS: ");
            String name = scanner.nextLine();
            System.out.println("Mời b nhập tên quê quán: ");
            String country = scanner.nextLine();
            System.out.println("Mời b nhập ngày sinh: ");
            String birthDay= scanner.nextLine();
            LocalDate birthDate = Utils.convertStringToDate(birthDay, "dd/MM/yyyy");
            Student student = new Student(name, country, birthDate);
            students.add(student);
        }
        DataBase.students.addAll(students);
    }

    public void findByCountryAndYearOfBirthDate(){
        for (Student student: DataBase.students){
            if("TN".equals(student.getCountry()) && student.getBirthDate()!=null
                    && 1985== student.getBirthDate().getYear()){
                System.out.println(student);
            }
        }
    }
}
