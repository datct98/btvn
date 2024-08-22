package extend_lesson.buoi7.hospital;

public class Patient extends Person{
    private int number;
    private String day;


    public Patient(String name, int age, int number, String day) {
        super(name, age);
        this.number = number;
        this.day = day;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "number=" + number +
                ", day='" + day + '\'' +
                '}';
    }
}
