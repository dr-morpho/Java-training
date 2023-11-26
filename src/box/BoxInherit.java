package box;

public class BoxInherit extends Box {
    private double weight;
    
    public BoxInherit() {
        this.weight = 0.0;
    }
    
    public BoxInherit(double lenght, double width, double height, double weight) {
        super(lenght, width, height);
        this.weight = weight;
    }
    
    public BoxInherit(double size, double weight) {
        super(size);
        this.weight = weight;
    }
    
    public BoxInherit(double weight) {
        this.weight = weight;
    }
    
    public BoxInherit(Box input, double weight) {
        super(input);
        this.weight = weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void setParamsInherit(double lenght, double height, double width, double weight) {
        super.setParams(lenght, height, width);
        this.weight = weight;
    }
    
    public double getWeight() {
        return weight;
    }
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Вес: " + this.weight);
    }
}
