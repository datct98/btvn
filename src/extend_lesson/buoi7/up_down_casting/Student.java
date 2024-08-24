package extend_lesson.buoi7.up_down_casting;

public class Student extends People{
    public Student(String name) {
        super(name);
    }
    private int age;

    public Student(String name, int age) {
        super(name);
        this.age = age;
    }
    public void studentSayHi(){
        System.out.println("Student say hi");
    }
}
