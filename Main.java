package Lesson4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        text.add("дом");
        text.add("дом");
        text.add("ром");
        text.add("рим");
        text.add("док");
        text.add("док");
        text.add("док");
        text.add("дым");
        text.add("дым");
        text.add("дым");
        text.add("дым");
        text.add("ком");
        text.add("сом");
        text.add("сом");
        text.add("сом");
        text.add("сом");
        text.add("сом");
        text.add("сом");
        text.add("сом");
        text.add("ном");
        HashMap<String, Integer> uniqueText = new HashMap<>();

        for (String element: text){
            if (! uniqueText.containsKey(element)){
                uniqueText.put(element,1);
            } else {
                int value = uniqueText.get(element);
                uniqueText.put(element, ++value);
            }

        }
        System.out.println("Task 1 *******");
        System.out.println(uniqueText);
        System.out.println("Task 2 *******");


        PhoneDirectory ourPhoneBook = new PhoneDirectory();
        ourPhoneBook.addCaller("8917","ddddd");
        ourPhoneBook.addCaller("8903","sssss");
        ourPhoneBook.addCaller("8915","lllll");
        ourPhoneBook.addCaller("8916","lllll");
        ourPhoneBook.addCaller("8925","lllll");
        ourPhoneBook.addCaller("8926","sssss");
        ourPhoneBook.addCaller("8906","ddddd");

        System.out.println(ourPhoneBook.getPhoneByFIO("ddddd"));
        System.out.println(ourPhoneBook.getPhoneByFIO("sssss"));
        System.out.println(ourPhoneBook.getPhoneByFIO("lllll"));
        System.out.println(ourPhoneBook.getPhoneByFIO("yyyyy"));
    }
}
