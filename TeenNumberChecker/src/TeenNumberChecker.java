public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third) {
        if(isTeen(first) || (isTeen(second) || (isTeen(third)))){
            return true;
        }
        return false;
    }

    public static boolean isTeen(int number){
        if(number < 13 || number > 19){
            return false;
        }
        return true;
    }
}