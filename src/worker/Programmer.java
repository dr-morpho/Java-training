package worker;

public class Programmer implements Worker, Drive {
    @Override
    public void work() {
        System.out.println("Программист работает");
    }
    
    @Override
    public void drive() {
        System.out.println("Программист на машине");
    }
}
