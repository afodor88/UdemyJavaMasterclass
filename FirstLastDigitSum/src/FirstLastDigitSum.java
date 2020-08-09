public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {

        if(number < 0) {
            return -1;
        }

        int sum = 0;
        int firstDigit = 0;
        int lastDigit = number % 10;

        while(number > 0) {
            number /= 10;
            firstDigit = number % 10;
            number /= 10;

        }

        sum = firstDigit + lastDigit;

        return sum;
        
    }
}