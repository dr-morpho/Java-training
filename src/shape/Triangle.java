package shape;

public class Triangle extends Shape {
    private double c;
    
    public Triangle(){
        this.c = 2;
    }
    
    public Triangle(double a, double b, double c){
        super(a, b);
        this.c = c;
    }
    
    public void setTriangleParams(double a, double b, double c){
        super.setParams(a,b);
        this.c = c;
    }
    
    @Override
    public double sumShape(){
        return getA() + getB() + this.c;
    }
}
