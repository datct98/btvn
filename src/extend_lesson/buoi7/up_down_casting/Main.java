package extend_lesson.buoi7.up_down_casting;

public class Main {
    public static void main(String[] args) {
        People people = new Student("Dat");



        People student = new Student("Huy", 21);
        student.peopSayHi();
        ((Student) student).studentSayHi();

        Student student2 =new Student("Quang", 22);
        student2.peopSayHi();
        student2.studentSayHi();



    }
}
