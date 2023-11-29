package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Bird bird = new Bird();

//      В качетсве типа коллекции указываем родительский абстрактный класс Animal:
//      В данном случае был произведен апкаст наследников класса Animal, апкаст - это приведение к родительскому типу.
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(fish);
        animals.add(bird);
        
        for (int i = 0; i < animals.size(); i++) {
            animals.get(i).eat();
        }

//     Пример апкаста с переменными - неявное приедение типа к родительскому, выполняется автоматически:
//        Animal animal = new Dog();
//     Пример даункаста - приведение от родительского типа к дочернему (приведение типа необходимо указывать явно - вручную):
//        Dog dogTwo = (Dog) animal;
//        dogTwo.run();

//      Реализация через интерфейс:
        ArrayList<AbleToRun> animalsInterface = new ArrayList<>();
        animalsInterface.add(cat);
        animalsInterface.add(dog);
        animalsInterface.add(bird);
        
        for (AbleToRun elems : animalsInterface) {
            elems.run();
        }
        
        AbleToFly birdFly = new Bird();
        birdFly.fly();
    }
}
