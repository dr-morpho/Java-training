package multithreading;

public class Timer implements Runnable {
    int input;
    Timer(){
        this.input = 1;
    }
    Timer(int input){
        this.input = input;
    }
    public void setInput(int input){
        this.input = input;
    }
    
    @Override
    public void run() {
        for(int i = 0; i < 1_000_000; i++) {
            System.out.println(input);
        }
    }
}
