public class LargestPrime {
    public static int getLargestPrime(int number){

        int largestNumber = 0;
        //int factors = 0;
        if(number > 1) {

            //Start by dividing the number by the first prime number 2 and continue dividing by 2 until you get a decimal
            // or remainder. Then divide by 3, 5, 7, etc. until the only numbers left are prime numbers.
            for(int i = 2; i <= number; i++){
                if(number % i == 0){
                    largestNumber = i;
                    number = number / i;
                    i--;
                }
            }
            return largestNumber;
        }
        return -1;
    }
}