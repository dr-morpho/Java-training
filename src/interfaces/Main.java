package interfaces;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Bird bird = new Bird();
        
//      В качетсве типа коллекции указываем родительский абстрактный класс Animal:
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(fish);
        animals.add(bird);
        
        for(int i = 0; i < animals.size(); i++){
            animals.get(i).eat();
        }
    }
}
