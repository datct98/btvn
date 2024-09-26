package extend_lesson.relationship.service;

import extend_lesson.relationship.data.Database;
import extend_lesson.relationship.entities.Classroom;
import extend_lesson.relationship.entities.Student;

import java.util.ArrayList;
import java.util.List;

public class StudnetService {
    ClassroomService classroomService = new ClassroomService();
    public Student findById(int id){
        for (Student student: Database.students){
            if(student.getId() == id)
            return student;
        }
        return null;
    }

    public void displayStudentInfo(Student student){
        System.out.println("Tên: "+student.getName());
        System.out.println("Score: "+student.getScore());
        System.out.println("TT lớp học: ");
        System.out.println(classroomService.findById(student.getClassId()));
    }

    public void findStudentsByClassId(int classId){
        // danh sách những hs học lớp classId
        List<Student> students = new ArrayList<>();
        for (Student student: Database.students){
            if(student.getClassId() == classId){
                students.add(student);
            }
        }
        System.out.println(students);
    }
}
