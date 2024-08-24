package extend_lesson.buoi7.techmaster;

public class BizStudent extends TechmasterStudent{
    private double marketing;
    private double sales;

    public BizStudent(double marketing, double sales) {
        this.marketing = marketing;
        this.sales = sales;
    }

    public double getMarketing() {
        return marketing;
    }

    public void setMarketing(double marketing) {
        this.marketing = marketing;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public double getPoint() {
        return (2*marketing + sales)/3;
    }

}
