package shape;

public abstract class Shape {
    private double a;
    private double b;
    
    public Shape(){
        this.a = 2;
        this.b = 2;
    }

    public Shape(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public double getA() {
        return a;
    }
    
    public double getB() {
        return b;
    }
    
    public void setParams(double a, double b){
        this.a = a;
        this.b = b;
    }
    public abstract double sumShape();
    
    
}
