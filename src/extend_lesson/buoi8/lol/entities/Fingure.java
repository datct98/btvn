package extend_lesson.buoi8.lol.entities;

public class Fingure {
    private String name;
    private String position;

    public Fingure(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Fingure{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
