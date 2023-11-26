package inheritance;

public class CatFamily {
//    Модификатор protected дает доступ ко всем полям родительского класса в наследуемых классах.
    protected int legs;
    protected int eyes;
    protected boolean canEatPerson;
    
//    Обычный конструктор:
//    public CatFamily(){
//        this.legs = 4;
//        this.eyes = 2;
//        this.canEatPerson = true;
//    }
//    Параметризированный конструктор:
    public CatFamily(int legs, int eyes, boolean canEatPerson) {
        this.legs = legs;
        this.eyes = eyes;
        this.canEatPerson = canEatPerson;
    }
    
    public void eat(){
        System.out.print("Ем ");
    }
    
    public void setLegs(int legs) {
        this.legs = legs;
    }
    
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }
    
    public void setCanEatPerson(boolean canEatPerson) {
        this.canEatPerson = canEatPerson;
    }
    
    public int getLegs() {
        return legs;
    }
    
    public int getEyes() {
        return eyes;
    }
    
    public boolean isCanEatPerson() {
        return canEatPerson;
    }
}
