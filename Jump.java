package Lesson1v1;

public class Jump extends Obstacle {
    private int height;

    public Jump(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Competitor competitor) {
        competitor.jump(height);
    }
}