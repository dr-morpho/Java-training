package gift;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.animalGet(cat, "вискас");
        
        animal.animalGet(new GetSome() {
            @Override
            public void getToMe(String input) {
                System.out.println("Я несу " + input);
            }
        }, "мяч");
    }
}
