package worker;

public class Director implements Worker, Drive {
    @Override
    public void work() {
        System.out.println("Директор работает");
    }
    
    @Override
    public void drive() {
        System.out.println("Директор на машине");
    }
}
