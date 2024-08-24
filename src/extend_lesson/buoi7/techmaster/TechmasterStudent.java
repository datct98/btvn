package extend_lesson.buoi7.techmaster;

public  abstract class TechmasterStudent {
    private String fullName;
    private String major;

    public abstract double getPoint();
    public String classify(){
        if(getPoint() <5)
            return "Yếu";
        else if(5<= getPoint() && getPoint() <6.5){
            return "TB";
        } else if(6.5<= getPoint() && getPoint() < 8)
            return "Khá";
        else return "Giỏi";
    }

    public void printInfo(){
        System.out.println("Name: "+fullName+"\n" +
                "Major: "+major+"\n" +
                "Point: "+ getPoint()+"\n" +
                "Classify: "+classify());
    }
}
