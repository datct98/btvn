package extend_lesson.buoi8.lol.entities;

import java.util.List;

public class SummonRif {
    private String timeStart;
    private List<Team> teams;

    public SummonRif(String timeStart, List<Team> teams) {
        this.timeStart = timeStart;
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SummonRif{" +
                "timeStart='" + timeStart + '\'' +
                ", teams=" + teams +
                '}';
    }
}
