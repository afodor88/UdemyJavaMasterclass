package app;

public class App {
    public static void main(String[] args) throws Exception {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous result = " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; //the remainder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //result = result + 1
        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        //result = result + 2

        result += 2;
        System.out.println("1 + 2 = " + result);


        //result = result * 10
        result *= 10;
        System.out.println("3 * 10 = " + result);

        boolean isAlien = false;
        if(isAlien == false){
            System.out.println("It is not a alien");
            System.out.println("And I am scared of aliens");
        }


        int topScore = 80;

        if (topScore < 100){
            System.out.println("You've got the high score");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than topscore and less than 100");
        }


        if ((topScore > 90) || (secondTopScore < 90)){
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not supposed to happen");
        }


        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }
    }
}