package extend_lesson.interface_lesson.lab1;

import extend_lesson.interface_lesson.lab1.entities.News;
import extend_lesson.interface_lesson.lab1.service.NewsService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NewsService newsService = new NewsService();
        System.out.println("Mời b nhập thông tin cho bản tin");
        Scanner scanner = new Scanner(System.in);
        News news = newsService.inputInfo(scanner);
        newsService.display(news);
    }
}
