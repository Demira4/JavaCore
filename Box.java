package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> things;

    public Box(T... things) {
        this.things = new ArrayList<T>(Arrays.asList(things));
    }

    public void add(T... things) { //добавление в коробку
        this.things.addAll(Arrays.asList(things));
    }

    public float getWeight() { // получение веса коробки
        if (things.size() == 0) return 0;
        float weight = 0;
        for (T thing : things) weight += thing.getWeight();
        return weight;
    }

    public boolean compare(Box box) { // сравнение двух коробок
        System.out.println("Коробка1 весит -" + this.getWeight());
        System.out.println("Коробка2 весит -" + box.getWeight());
        System.out.println("Равен ли вес коробки1 весу коробки2 : ");
        return this.getWeight() == box.getWeight();

    }

    public void clear() { // очищение коробки
        things.clear();
    }

    public void transfer(Box<? super T> box) { // пересыпание из одной коробки в другую
        System.out.println("***Вес коробок до пересыпания***");
        System.out.println("Коробка 1 : " + this.getWeight());
        System.out.println("Коробка 2 : " + box.getWeight());
        box.things.addAll(this.things);
        clear();
        System.out.println("***Вес коробок после пересыпания***");
        System.out.println("Коробка 1 : " + this.getWeight());
        System.out.println("Коробка 2 : " + box.getWeight());
    }
}

