package extend_lesson.buoi8.lol.entities;

import java.util.List;

public class Team {

    private List<Fingure> fingures;

    public Team(List<Fingure> fingures) {
        this.fingures = fingures;
    }

    public Team() {
    }

    @Override
    public String toString() {
        return "Team{" +
                "fingures=" + fingures +
                '}';
    }
}
