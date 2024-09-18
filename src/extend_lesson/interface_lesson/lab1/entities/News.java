package extend_lesson.interface_lesson.lab1.entities;

public class News {
    private String title;
    private String author;
    private double rate;
    private String publicDate;

    public News(String title, String author, double rate, String publicDate) {
        this.title = title;
        this.author = author;
        this.rate = rate;
        this.publicDate = publicDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", rate=" + rate +
                ", publicDate='" + publicDate + '\'' +
                '}';
    }
}
