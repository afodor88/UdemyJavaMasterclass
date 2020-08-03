package app;

public class App {
    public static void main(String[] args) throws Exception {
        double variableA = 20.00d;
        double VariableB = 80.00d;
        double result = (variableA + VariableB) * 100.00d;
        double remainder =  result % 40.00d;
        boolean isZero = (remainder == 0) ? true : false;
        System.out.println("Value of isZero is " + isZero);

        if (!isZero){
            System.out.println("Got some remainders!");
        }

    }
}