package Lesson1v1;



public class Run extends Obstacle {
    private int distance;

    public Run(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.run(distance);
    }
}
