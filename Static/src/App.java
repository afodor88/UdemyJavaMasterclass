public class App {
    public static int multiplier = 7;
    public static void main(String[] args) throws Exception {
        // StaticTest firstInstance = new StaticTest("1st Instance");
        // System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        // StaticTest secondInstance = new StaticTest("2nd Instance");
        // System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        // StaticTest thirdInstance = new StaticTest("3rd Instance");
        // System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        int answear = multiply(6);
        System.out.println("The answer is " + answear);
        System.out.println("Multiplier is " + multiplier);
    }
    public static int multiply(int number){
        return number * multiplier;
    }
}
