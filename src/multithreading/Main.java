package multithreading;

public class Main {
    static boolean isFive = false;
    public static void main(String[] args) {
    
//      Использование потока путем создания класса:

//        Timer timer = new Timer();
//        timer.setInput(3);
//        Thread anotherThread = new Thread(timer);
//        anotherThread.start();
        
//      Поток через анонимный интерфейс:
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1_000_000; i++) {
                    System.out.println(i);
                    if (i == 5) {
                        isFive = true;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread.start();
        
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 1_000_000; i++) {
                    if(isFive){
                        break;
                    }
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread2.start();
    }
}
