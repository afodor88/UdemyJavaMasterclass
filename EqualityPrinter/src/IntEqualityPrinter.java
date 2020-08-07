public class IntEqualityPrinter {

    public static final String INVALID_VALUE_ERROR = "Invalid Value";
    public static final String ALL_NUMBERS_EQUAL = "All numbers are equal";
    public static final String ALL_NUMBERS_ARE_DIFFERENT = "All numbers are different";
    public static final String NEITHER_ALL_ARE_EQUAL_OR_DIFFERENT = "Neither all are equal or different";

    public static void printEqual(int numberA, int numberB, int numberC) {

        if (numberA < 0 || numberB < 0 || numberC < 0) {
            System.out.println(INVALID_VALUE_ERROR);
        } else if ((numberA == numberB) && (numberB == numberC) && (numberC == numberA)) {

            System.out.println(ALL_NUMBERS_EQUAL);
        } else if ((numberA != numberB) && (numberB != numberC) && (numberC != numberA)) {

            System.out.println(ALL_NUMBERS_ARE_DIFFERENT);
        } else {

            System.out.println(NEITHER_ALL_ARE_EQUAL_OR_DIFFERENT);
        }
    }
}