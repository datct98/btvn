package extend_lesson.buoi8.lol.service;

import extend_lesson.buoi8.lol.entities.Fingure;
import extend_lesson.buoi8.lol.entities.Team;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamService {
    FigureService figureService = new FigureService();

    public Team inputTeam(Scanner sc, int numberFigures, ArrayList<Fingure> fingures){

        System.out.println("Mời b nhập thông tin của các thành viên: ");
        for (int i = 0; i < numberFigures; i++) {
            Fingure fingure = figureService.inputFigure(sc);
            fingures.add(fingure);
        }
        return new Team(fingures);
    }
}
