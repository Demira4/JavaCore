package Lesson1v1;

public class Swim extends Obstacle {
    private int distance;

    public Swim(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.swim(distance);
    }
}