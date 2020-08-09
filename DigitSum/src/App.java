public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(("The sum of the digits in the number " + 123 + " is " + sumDigits(123)));
        System.out.println(("The sum of the digits in the number " + -125 + " is " + sumDigits(-125)));
        System.out.println(("The sum of the digits in the number " + 4 + " is " + sumDigits(4)));
        System.out.println(("The sum of the digits in the number " + 32123 + " is " + sumDigits(32123)));
    }

    private static int sumDigits(int number) {
        if(number < 10){
            return -1;
        }

        int sum = 0;
        while(number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }

        return sum;
    }
}
