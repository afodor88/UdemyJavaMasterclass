package app;

public class App {
    public static void main(String[] args) throws Exception {
    //byte
    //short
    //int
    //long
    //float
    //double
    //char
    //boolean

    String myString = "This is a string";

    System.out.println("My String is = " + myString);

    myString = myString + ", and this is more.";

    System.out.println(myString);

    myString = myString + " \u00A9 2019";
    System.out.println(myString);

    String numberStrings = "250.55";
    numberStrings = numberStrings + "49.95";
    System.out.println(numberStrings);

    String lastString = "10";
    int myInt = 50;
    lastString = lastString + myInt;

    System.out.println(lastString);

    double doubleNumber = 120.47d;
    lastString = lastString + doubleNumber;
    System.out.println(lastString);

    }
}