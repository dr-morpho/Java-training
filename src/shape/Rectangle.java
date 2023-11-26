package shape;

public class Rectangle extends Shape {
    private double c;
    private double d;
    public Rectangle(){
        super(2,2);
        this.c = 3;
        this.d = 3;
    }
    
    public Rectangle(double a, double b, double c, double d){
        super(a,b);
        this.c = c;
        this.d = d;
    }
    
    @Override
    public double sumShape(){
        return getA() + getB() + this.c + this.d;
    }
}
