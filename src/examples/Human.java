package examples;

public class Human {
    private String name;
    private int age;
    private double weight;
    
    private static String thisShit;
    
    public static void setThisShit(String input) {
        Human.thisShit = input;
    }
    
    public static String getThisShit() {
        return Human.thisShit;
    }
    
    public Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public Human() {
        this.name = "Test";
        this.age = 0;
        this.weight = 0;
    }
    
    //    Геттеры и сеттеры:
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public void showPerson() {
        System.out.println("Name: " + this.name + "\n" + "Age: " + this.age + "\n" + (this.weight == 0 ? "" : "Weight: " + this.weight));
    }
    
    public static void testFunc(String input) {
        System.out.println("It's " + input + " work..");
    }
    
    
}
