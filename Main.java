package Lesson3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        Integer[] intArr = new Integer[5];

        intArr[0] = 10;
        intArr[1] = 50;
        intArr[2] = 30;
        intArr[3] = 80;
        intArr[4] = 20;
        String[] strArr = new String[5];
        strArr[0] = "55";
        strArr[1] = "66";
        strArr[2] = "77";
        strArr[3] = "88";
        strArr[4] = "99";

        System.out.println("******Перестановка элементов в массиве ******");
        System.out.println("*** До перестановки 2 и 5 элемента ***");
        System.out.println(Arrays.deepToString(strArr));
        System.out.println(Arrays.deepToString(intArr));
        swap(intArr, 1, 4);
        swap(strArr,1,4);
        System.out.println("*** После перестановки 2 и 5 элемента ***");
        System.out.println(Arrays.deepToString(strArr));
        System.out.println(Arrays.deepToString(intArr));


        // Задача
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box<Apple> boxApple = new Box<Apple>(apple1, apple2, apple3, apple4);
        Box<Orange> boxOrange = new Box<Orange>(orange1, orange2, orange3);
       System.out.println("******Сравнение коробок с фруктами по весу ******");
//        System.out.println("Коробка с яблоками весит -" + boxApple.getWeight());
//        System.out.println("Коробка с апельсинами весит -" + boxOrange.getWeight());
        System.out.println(boxApple.compare(boxOrange));


        Box<Orange> boxNew = new Box<Orange>();
        System.out.println("******Пересыпание фруктов из одной коробки в другую ******");

        boxOrange.transfer(boxNew);// пересыпали в новую коробку

    }


    public static void swap(Object[] arr, int index1, int index2) { // меняет местами элементы в массиве
        Object tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;

    }


}
