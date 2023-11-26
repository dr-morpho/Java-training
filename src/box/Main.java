package box;

public class Main {
    public static void main(String[] args) {
        Box sameBox = new Box();
        BoxInherit inheritBox = new BoxInherit();
        inheritBox.setParamsInherit(6.0, 5.0, 3.0, 2.0);
        inheritBox.showInfo();
        System.out.println("----------");
        sameBox.showInfo();
    }
    
}
