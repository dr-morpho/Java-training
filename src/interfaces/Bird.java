package interfaces;

public class Bird extends Animal implements AbleToFly, AbleToRun {
    @Override
    public void eat() {
        System.out.println("Птичий корм");
    }
    
    public void fly(){
        System.out.println("Птичка летает");
    }

    public void run(){
        System.out.println("Птичка бегает");
    }
    
}
