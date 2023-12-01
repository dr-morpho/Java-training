package gift;

public class Cat implements GetSome {
    @Override
    public void getToMe(String input){
        System.out.println("Я несу " + input);
    }
}
