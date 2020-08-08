public class App {
    public static void main(String[] args) throws Exception {
        // int value = 1;
        // if (value == 1) {
        // System.out.println("Value was 1");
        // } else if(value == 2) {
        // System.out.println("Value was 2");
        // } else {
        // System.out.println("Was not 1 or 2");

        // }

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was 3, 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }

        char character = 'C';
        switch (character) {
            case 'A':
                System.out.println("Character is A");
                break;
            case 'B':
                System.out.println("Character is B");
                break;
            case 'C':
                System.out.println("Character is C");
                break;
            case 'D':
                System.out.println("Character is D");
                break;
            case 'E':
                System.out.println("Character is E");
                break;
            default:
                System.out.println("Could not find A, B, C, D or E");
                break;
        }

        String month = "JANUARY";

        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
        }

        // More code here
    }
}
