public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if ((a < 10 || a > 99) || (b < 10 || b > 99)) {
            return false;
        }

        while (a > 0) {
            int lastDigitA = a % 10;
            a /= 10;
            int temp = b;
            b = temp;
            while (temp > 0) {
                int lastDigitB = b % 10;
                if (lastDigitA == lastDigitB) {
                    return true;
                }
                temp /= 10;
                continue;
            }
        }
        return false;
    }

}