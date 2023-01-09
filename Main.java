package Lesson_9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Храмогин", Arrays.asList(new Course("Физика"), new Course("Информатика"))));
        students.add(new Student("Царь", Arrays.asList(new Course("Физика"), new Course("Информатика"), new Course("Криптография"))));
        students.add(new Student("Деревянко", Arrays.asList(new Course("Криптография"), new Course("Базы данных"), new Course("Информатика"), new Course("Химия"))));
        students.add(new Student("Плющев", Arrays.asList( new Course("Информатика"), new Course("Криптография"))));
        students.add(new Student("Стратегов", Arrays.asList(new Course("Химия"), new Course("Информатика"), new Course("Криптография"))));

        System.out.println("Список уникальных курсов:");
        System.out.println(students.stream()
                .map(s -> s.getCourses())
                .flatMap(f -> f.stream())
                .collect(Collectors.toSet()));
        System.out.println("Список самых любознательных студентов(исходя из количесвтва курсов):");
        System.out.println(students.stream()
                .sorted((s1, s2) -> s2.getCourses().size() - s1.getCourses().size())
                .limit(3)
                .collect(Collectors.toList()));
        System.out.println("Список студентов посещающих выбранный курс (Химия) ");
        Course course = new Course("Химия");
        System.out.println(students.stream()
                .filter(s -> s.getCourses().contains(course))
                .collect(Collectors.toList()));
    }
}
