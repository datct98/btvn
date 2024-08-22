package extend_lesson.buoi7.sida;

public class HinhVuong extends HinhChuNhat{
    private double sied;

    public HinhVuong(double sied) {
        this.sied = sied;
    }

    @Override
    public void xuat() {
        System.out.println("HÌnh vuoogn nè:");
    }
}
