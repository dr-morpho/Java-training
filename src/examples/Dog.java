package examples;

public class Dog {
    public String dogInfo(String name, double weight, String breed, int speed){
        StringBuilder iteration = new StringBuilder();
        if(speed <= 0) {
            iteration.append("Chill :)");
        } else {
            for(int i = 0; i < speed; i++) {
                iteration.append("Run! ");
            }
        }

        return "Name: " + name + "\n" + "Weight: " + weight + "\n" + "Breed: " + breed + "\n" + "Speed: " + iteration;
    }
    
    
}
