package exceptions;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        try {
            int b = 7 / a;
            int c = Integer.parseInt("lalka");
//        Можно указывать конкретный тип исключения
//        } catch (ArithmeticException e){
//            System.out.println("Тут ошибка да, пардон");
//        } catch (NumberFormatException e) {
//            System.out.println("Не число указал ты");
//        }
//        Либо польностью весь класс:
        } catch (Exception e) {
            System.out.println("Не получилось, не фортануло: " + e.getClass());
        }
        ;
    }
}
