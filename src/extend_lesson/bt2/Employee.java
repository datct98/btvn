package extend_lesson.bt2;

public class Employee extends Person{
    private double exp;
    private String placeWork;

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }


    public Employee(int id, String address, int age, double exp, String placeWork) {
        super(id, address, age);
        this.exp = exp;
        this.placeWork = placeWork;
    }

    @Override
    public String toString() {
        return "Id: "+getId()+"\n" +
                "Address: "+getAddress()+"\n" +
                "Age: "+getAge()+"\n" +
                "Exp: "+exp+"\n" +
                "Place:"+placeWork;
    }
}
