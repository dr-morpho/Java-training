package box;

public class Box {
    private double lenght, width, height;
    
    //    Перегрузка конструкторов:
    public Box(double lenght, double width, double height) {
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }
    
    public Box(double size) {
        this(size, size, size);
    }
    
    public Box() {
        this(2);
    }
    
    //    Копирование экземпляра:
    public Box copyBox() {
        return new Box(this.lenght, this.width, this.height);
    }
    
    //    Увеличение в два раза:
    public Box increase() {
        return new Box(this.lenght * 2, this.width * 2, this.height * 2);
    }
    
    //    Конструктор - параметр в конструкторе:
    public Box(Box input) {
        this(input.lenght, input.width, input.height);
    }

//    Объекты в качестве параметров:
    
    public void setParams(double lenght, double height, double width) {
        this.lenght = lenght;
        this.height = height;
        this.width = width;
    }
    
    public double getLenght() {
        return lenght;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public int compare(Box another) {
        double currentBox = getVolume();
        double anotherBox = another.getVolume();
        return currentBox < anotherBox ? -1 : currentBox > anotherBox ? 1 : 0;
    }
    
    private double getVolume() {
        return lenght * width * height;
    }
    
    public void showVolume() {
        System.out.println(lenght * width * height);
    }
    public void showInfo() {
        System.out.println("Длина: " + lenght + "\n" + "Ширина: " + width + "\n" + "Высота: " + height);
    }
    

    
    
}
