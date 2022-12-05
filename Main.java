package Lesson1v1;

public class Main {
    public static void main (String[] args){

        Competitor[] competitors = {new Human("Саша", 2500,200,600),
                new Human("Миша",2000,350,500),
                new Human("Иван",3000,100,700)};
        Obstacle[] obstacles = {new Run(2000), new Jump(200), new Swim(550)};

        Team team = new Team("Волки", competitors);

        System.out.printf("В состав команды %s входят: %n", team.getTeamName());
        //System.out.println(team.getTeamName());

        //team.showResults();
        team.getTeamInfo();

        // new Course
        Course course = new Course(obstacles);

        System.out.println("***Команда выполняет полосу препятствий***");
        course.doIt(team);

        System.out.println("***Итоговый результат по всем препятствиям***");
        team.showResults();

        System.out.println("***Участники прошедшие всю полосу препятствий***");
        team.showMembersFinishedCourse();

    }
}
