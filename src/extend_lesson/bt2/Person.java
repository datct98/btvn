package extend_lesson.bt2;

public class Person {
    private int id;
    private String address;
    private int age;

    public Person(int id, String address, int age) {
        this.id = id;
        this.address = address;
        this.age = age;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
