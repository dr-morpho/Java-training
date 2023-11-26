package shape;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,2,2);
        Rectangle square = new Rectangle(2,2,3,3);
        
        System.out.println(triangle.sumShape());
        System.out.println(square.sumShape());
        System.out.println("test git");
    }
}