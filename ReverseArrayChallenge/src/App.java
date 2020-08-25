import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter the size of the array");
        int count = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the elements of the array");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + i);
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("The array is " + Arrays.toString(array));
        reverse(array);
        System.out.println("The array is " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int temp;
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
            // maxIndex--;
        }
    }
}
