package Lesson2;

public class MyArrayDataException extends Exception {
    public MyArrayDataException(int i, int j, String str){
        super(String.format("Некорректное значение %s в ячейке %d-%d",str,i,j));
    }
}
