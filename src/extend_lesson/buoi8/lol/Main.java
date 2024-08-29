package extend_lesson.buoi8.lol;

import extend_lesson.buoi8.lol.entities.Fingure;
import extend_lesson.buoi8.lol.entities.Team;
import extend_lesson.buoi8.lol.service.TeamService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Fingure> fingures = new ArrayList<>();
        do {
            TeamService teamService = new TeamService();
            //ArrayList<Team> teams= new ArrayList<>();
            Team team = teamService.inputTeam(scanner, 1, fingures);
            System.out.println(team);
        } while (true);

    }
}
