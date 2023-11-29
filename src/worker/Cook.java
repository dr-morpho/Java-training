package worker;

public class Cook implements Worker {
    @Override
    public void work() {
        System.out.println("Повар работает");
    }
}
