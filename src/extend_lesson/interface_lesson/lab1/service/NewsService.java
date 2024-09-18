package extend_lesson.interface_lesson.lab1.service;

import extend_lesson.interface_lesson.lab1.entities.News;

import java.util.Scanner;

public class NewsService implements INews{


    public News inputInfo(Scanner scanner){
        System.out.println("Mời b nhập title: ");
        String title = scanner.nextLine();
        System.out.println("Mời b nhập author: ");
        String author = scanner.nextLine();
        System.out.println("Mời b nhập ngày xuất bản: ");
        String publicDate = scanner.nextLine();
        System.out.println("Mời b nhập đánh giá: ");
        double rate = Double.parseDouble(scanner.nextLine());
        return new News(title, author, rate, publicDate);
    }

    @Override
    public void display(News news) {
        System.out.println(news);
    }
}
