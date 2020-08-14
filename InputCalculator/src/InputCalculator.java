import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        long avg = 0;
        int nrCount = 0;

        while (true) {
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                nrCount++;
            } else {
                break;
            }
            scanner.nextLine();
        }

        avg = Math.round(((double) sum / (double) nrCount));
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}