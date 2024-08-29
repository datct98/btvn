package extend_lesson.buoi8.lol.service;

import extend_lesson.buoi8.lol.entities.Fingure;

import java.util.Scanner;

public class FigureService {
    public Fingure inputFigure(Scanner sc){
        System.out.println("Mời b nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Mời b nhập vị trí: ");
        String position = sc.nextLine();
        return new Fingure(name, position);
    }
}
