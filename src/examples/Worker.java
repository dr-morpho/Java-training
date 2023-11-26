package examples;

public class Worker {
    String name, post;
    double salary;
    
    Worker() {
        name = "Default";
        post = "Default";
        salary = 10000;
    }
    
    public Worker(String name, String post, double salary) {
        this.name = name;
        this.post = post;
        this.salary = salary;
    }
    
    public void aboutWorker() {
        System.out.println("Name: " + name + "\n" + "Post: " + post + "\n" + "Salary: " + salary);
    }
}
