package extend_lesson.buoi7.techmaster;

public class ItStudent extends TechmasterStudent{
    private double html;
    private double css;
    private double java;

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public ItStudent(double html, double css, double java) {
        this.html = html;
        this.css = css;
        this.java = java;
    }

    @Override
    public double getPoint() {
        return (java*2 + html + css)/4;
    }
}
