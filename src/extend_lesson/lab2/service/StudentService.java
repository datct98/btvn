package extend_lesson.lab2.service;

import extend_lesson.lab2.data.Database;
import extend_lesson.lab2.entities.Student;

import java.util.List;
import java.util.Scanner;

public class StudentService {
    public Student inputStudent(Scanner scanner){
        System.out.println("Mời b nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập điểm toán:");
        double math = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm lý:");
        double physic = Double.parseDouble(scanner.nextLine());
        Student student = new Student(name, math, physic);
        Database.students.add(student);
        return student;
    }

    public void classifyStudent(){
        int countA =0, countB= 0, countC =0;
        for (Student student: Database.students){
            if(calculateAvgScore(student)>=8){
                countA++;
            } else if(calculateAvgScore(student)>= 6.5 && calculateAvgScore(student)<8){
                countB++;
            } else {
                countC++;
            }
        }
        System.out.println("%A: "+ (countA/Database.students.size() *100));
        System.out.println("%B: "+ (countB/Database.students.size() *100));
        System.out.println("%C: "+ (countC/Database.students.size() *100));
    }

    private double calculateAvgScore(Student student){
        return (student.getScoreMath() + student.getScorePhysic())/2;
    }
}
