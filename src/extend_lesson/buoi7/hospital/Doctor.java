package extend_lesson.buoi7.hospital;

public class Doctor extends Person{
    private String timeWork;
    private String major;

    public Doctor(String name, int age, String timeWork, String major) {
        super(name, age);
        this.timeWork = timeWork;
        this.major = major;
    }

    public String getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(String timeWork) {
        this.timeWork = timeWork;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "timeWork='" + timeWork + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
