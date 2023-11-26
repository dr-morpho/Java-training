package test;

import java.util.Arrays;

public class MyArrayList {
    private String[] array = new String[10];
    private int size = 0;
    
    public String getElem(int index) {
        return array[index];
    }
    
    public String getArray(){
        return Arrays.toString(array);
    }
    public void add(String elem) {
//        Добавляет элемент по индексу:
        array[size] = elem;
        size++;
        if(size == array.length) {
            String[] newArray = new String[array.length * 2];
            for(int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }
    
    public void remove(int index) {
        for(int i = index; i < size; i++){
            array[i] = array[i + 1];
        }
        array[size] = null;
        size--;
    }
    public void remove(String input) {
        for(int i = 0; i < size; i++){
            if(input.equals(array[i])) {
                remove(i);
                return;
            }
        }
    }
    
    public int getSize() {
        return size;
    }
}
