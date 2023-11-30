package worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Programmer programmer = new Programmer();
        
        ArrayList<Worker> workArr = new ArrayList<>();
        workArr.add(cook);
        workArr.add(programmer);
        
        for(Worker elem : workArr){
            elem.work();
        }
        
        ArrayList<Drive> driveArr = new ArrayList<>();
        driveArr.add(programmer);
        
        for(Drive elem : driveArr) {
            elem.drive();
        }
        
        System.out.println("-------------------------");
        
        Director director = new Director();
//      Анонимные классы:
        director.force(new Worker() {
            @Override
            public void work(){
                System.out.println("Работу работаю");
            }
        });
    }
}
