package extend_lesson.relationship.data;

import extend_lesson.relationship.entities.Classroom;
import extend_lesson.relationship.entities.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
    public static List<Classroom> classrooms = new ArrayList<>(Arrays.asList(new Classroom("12A"),
            new Classroom("12B"),new Classroom("12C")));
    public static List<Student> students = new ArrayList<>(Arrays.asList(new Student("Dat", 7.5),
            new Student("Quang", 6.5), new Student("Huy", 8.5)));
}
