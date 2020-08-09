public class NumberPalindrome {
    

    public static boolean isPalindrome(int number) {
        
        int reverse = 0;
        int originalValue = number;
        while (number != 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }

        if(originalValue == reverse){
            return true;
        }

        return  false;
    }
 
}