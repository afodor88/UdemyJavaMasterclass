public class MinutesToYearsDaysCalculator{

    public static final String INVALID_VALUE_ERROR = "Invalid Value";

    public static void printYearsAndDays(long minutes) {

        if(minutes < 0) {
            System.out.println(INVALID_VALUE_ERROR);
        } else {
            
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            long remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }

    }
}