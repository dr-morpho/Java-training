package worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cook cook = new Cook();
        Director director = new Director();
        Programmer programmer = new Programmer();
        
        ArrayList<Worker> workArr = new ArrayList<>();
        workArr.add(cook);
        workArr.add(director);
        workArr.add(programmer);
        
        for(Worker elem : workArr){
            elem.work();
        }
        
        ArrayList<Drive> driveArr = new ArrayList<>();
        driveArr.add(programmer);
        driveArr.add(director);
        
        for(Drive elem : driveArr) {
            elem.drive();
        }
    }
}
