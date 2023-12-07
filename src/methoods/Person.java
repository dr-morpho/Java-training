package methoods;

public class Person {
    private String name;
    private int age;
    
    public Person(){
        this.age = 0;
        this.name = "no name";
    }
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    @Override
    public String toString(){
        return String.format("Name: %s\nAge: %s", this.name, this.age);
    }
    
}
