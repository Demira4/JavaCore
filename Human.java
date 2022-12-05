package Lesson1v1;


public class Human implements Competitor {
    String name;
    int maxRunDistance;

    public Human(String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " " + " успешно пробежал дистанцию");
        } else {
            System.out.println(name + " " + " не смог пробежать и выбывает");
            onDistance = false;
        }
    }

    public void jump(int height) {
        if (height <= maxJumpHeight) {
            System.out.println(name + " " + " успешно преодолел высоту");
        } else {
            System.out.println(name + " " + " не смог преодолеть высоту и выбывает");
            onDistance = false;
        }
    }

    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " " + " успешно проплыл дистанцию");
        } else {
            System.out.println(name + " " + " не смог проплыть дистанцию и выбывает");
            onDistance = false;
        }
    }

    public void showResult() {
        System.out.println(name + ": " + onDistance);
    }
    public void lineUp() {
        System.out.println("     " + name);
    }

}

