package extend_lesson.buoi7.techmaster_v2;

import extend_lesson.buoi7.techmaster_v2.entities.BizStudent;
import extend_lesson.buoi7.techmaster_v2.entities.ItStudent;
import extend_lesson.buoi7.techmaster_v2.entities.TechmasterStudent;
import extend_lesson.buoi7.techmaster_v2.service.BizStudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        TechmasterStudent[] techmasterStudents = new TechmasterStudent[3];
        ItStudent itStudent = new ItStudent("", "", 5,6,7);
        techmasterStudents[0] = itStudent;

        BizStudent bizStudent = new BizStudent("", "", 6,9);
        techmasterStudents[1] = bizStudent;

        System.out.println(techmasterStudents);

    }
}
