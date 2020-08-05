public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second){

        int firstDecimals = (int) (first * 1000);
        System.out.println(firstDecimals);
        int secondDecimals = (int) (second * 1000);
        System.out.println(secondDecimals);

        return (firstDecimals == secondDecimals);
    }
}