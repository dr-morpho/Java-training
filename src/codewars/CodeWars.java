package codewars;

public class CodeWars {
    public static boolean solution(String str, String end) {
        String[] arrStr = str.split(""), endStr = end.split("");
        String newStr = "", newEnd = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr += arrStr[i];
        }
        for (int i = end.length() - 1; i >= 0; i--) {
            newEnd += endStr[i];
        }

//        return newStr.substring(0, end.length()).equals(newEnd);
        return str.substring(str.length() - end.length()).equals(end);
//        return str.length() >= ending.length() ?
//                str.substring(str.length()-ending.length()).equals(ending) : false;
    }
    
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        return distanceToPump <= (mpg * fuelLeft);
    }
    
    public static void main(String[] args) {
        System.out.println(solution("MarlonBrando", "ndo"));
        System.out.println(zeroFuel(100,50,1));
        
    }
}
