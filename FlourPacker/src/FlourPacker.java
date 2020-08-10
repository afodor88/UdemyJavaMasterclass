public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        int bigFlourBag = bigCount * 5;
        int smallFlourBag = smallCount * 1;

        if((bigFlourBag + smallFlourBag) >= goal){
            return true;
        }

        return false;


    }
}