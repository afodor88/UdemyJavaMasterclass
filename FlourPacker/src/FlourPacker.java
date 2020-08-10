public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        for (int i = 0; i <= bigCount; i++) {
            for (int j = 0; j <= smallCount; j++) {
                if ((5 * i) + j == goal)
                    return true;
            }
        }
        return false;
    }
}


// public class FlourPacker {
//     public static boolean canPack(int bigCount,int smallCount, int goal){
//      if(bigCount<0 ||smallCount<0 ||goal<0){ // you CANNOT have negative kilos of flour
//          return false;
//      } else{
//         int sum=(bigCount*5)+smallCount; // your sum is number of 5 kilo bags+ number of 1 kilo bags. 
//         if(sum<goal){ // if the sum is less than the goal return false. 
//             return false;
//         }  else if(goal%5<=smallCount){ // if the remaining number of small count bags is less than small count return true.
//             return true;
//         }
//         return false; // else return false. 
//      }
//     }
//  }