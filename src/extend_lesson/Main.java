package extend_lesson;

public class Main {
    public static void main(String[] args) {
        People people = new People();
        people.setName("");
        Student student = new Student("dat", 12, 212);
        student.setScore(1);
        System.out.println(student);

    }
}
