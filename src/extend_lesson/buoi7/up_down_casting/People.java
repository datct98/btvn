package extend_lesson.buoi7.up_down_casting;

public abstract class People {
    private String name;

    public People(String name) {
        this.name = name;
    }
    public void peopSayHi(){
        System.out.println("People hi");
    }
}
