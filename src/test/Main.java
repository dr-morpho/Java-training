package test;

import java.util.ArrayList;

import box.Box;
import examples.*;

public class Main {
    //    Работа с коллекцией:
    
    //   1. Встроенная коллекция:
    private static ArrayList<String> getEmployeesTwo() {
        ArrayList<String> employessTwo = new ArrayList<>();
        employessTwo.add("Marlon");
        employessTwo.add("Max");
        employessTwo.add("Kate");
        employessTwo.add("Jhon");
        employessTwo.add("Arthur");
        
        return employessTwo;
    };
    
    private static ArrayList<Integer> getNumber(){
        ArrayList<Integer> getNumFunc = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            getNumFunc.add(i);
        }
        return getNumFunc;
    }
    
    private static ArrayList<String> getNumAndName(){
        return new ArrayList<>();
    }
    
    
    //   2. Собственная коллекция:
    private static MyArrayList getEmployees() {
        MyArrayList employees = new MyArrayList();
        employees.add("Marlon");
        employees.add("Max");
        employees.add("Kate");
        employees.add("Jhon");
        employees.add("Arthur");
        employees.add("Tim");
        employees.add("Gordon");
        employees.add("Jake");
        employees.add("Luis");
        employees.add("Mike");
        
        return employees;
    };
    
    public static void main(String[] args) {
        ArrayList<String> employNewTwo = getEmployeesTwo();
        
        for(int i = 0; i < employNewTwo.size(); i++){
            System.out.println(employNewTwo.get(i));
        }
        
        System.out.println("---------------------------------");
        
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            numbers.add(i);
        }
        
        numbers.add(33);
        numbers.remove(0);
        
//        ForEach:
        for(int elem : numbers) {
            System.out.println(elem);
        }
        
        System.out.println("---------------------------------");
        
        ArrayList<Integer> namesList = getNumber();
        ArrayList<String> numAndNames = getNumAndName();
        
        for(int i = 0; i < namesList.size(); i++){
            numAndNames.add(namesList.get(i) + " - " + employNewTwo.get(i));
        }
        
        for(String elem : numAndNames) {
            System.out.println(elem);
        }
        
//        Оболочки типов:
        System.out.println("---------------------------------");
        String s = "This is Jhon. He is 27 years old";
        Human newMan = new Human(s.substring(8, 12), Integer.parseInt(s.substring(20, 22)));
        newMan.showPerson();
        int a = 5;
        Integer a1 = 6;
        String num1 = "5";
        String num2 = "2";
        System.out.println(Integer.parseInt(num1) + Integer.parseInt(num2));
        
        System.out.println("---------------------------------");
        
        MyArrayList employNew = getEmployees();
        employNew.add("Mark");
        employNew.remove(3);
        employNew.remove(4);
        
        System.out.println(employNew.getArray());
        
        System.out.println("---------------------------------");
        
        Box boxCurrent = new Box(3);
        Box boxAnother = new Box(2);
        int result = boxCurrent.compare(boxAnother);
        System.out.println(result);
        
        System.out.println("---------------------------------");

//        Передача конструктора в качестве параметра:
        
        Box boxTwo = new Box(10);
        Box boxThree = new Box(boxTwo);
        Box boxThreeCopy = boxThree.copyBox();
        Box boxThreeIncrease = boxThree.increase();
        
        boxThree.copyBox();
//        boxThree.setParams(2,8,5);
        boxTwo.showVolume();
        boxThree.showVolume();
        boxThreeCopy.showVolume();
        boxThreeIncrease.showVolume();
        
        System.out.println("---------------------------------");
        
        Human manOne = new Human("Marlon", 27, 80);
        manOne.setAge(28);
        System.out.println(manOne.getName() + " " + manOne.getWeight() + " " + manOne.getAge());
        
        System.out.println("---------------------------------");
        
        Dog dogInfoOne = new Dog();
        System.out.println(dogInfoOne.dogInfo("Max", 8, "buldog", 8));
        
        System.out.println("---------------------------------");
        
        Rectangle rectangleOne = new Rectangle();
        rectangleOne.rectangleArea(5, 3);
        
        System.out.println("---------------------------------");
        
        Worker firstWorker = new Worker("Peter", "Manager", 80_000);
        firstWorker.aboutWorker();
        
        System.out.println("---------------------------------");
        
        System.out.println(MathOne.multiple(5.0, 5.0));
        System.out.println(MathOne.area(10));
        System.out.println(MathOne.sum(1, 2, 3, 4, 5, 6, 7));
        System.out.println("---------------------------------");
        
        Monster monsterOne = new Monster();
        monsterOne.monsterInfo();
        Monster.voice(3, "Ааааа");
        
        System.out.println("---------------------------------");
        
        
    }
}