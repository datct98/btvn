package extend_lesson.buoi7.techmaster;

public class Main {
    public static void main(String[] args) {
        BizStudent bizStudent = new BizStudent(5, 6);
        bizStudent.printInfo();

        ItStudent itStudent = new ItStudent(6, 7, 8);
        itStudent.printInfo();
    }
}
