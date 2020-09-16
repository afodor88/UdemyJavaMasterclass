import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer("Tim", 54.96);
        Customer anotheCustomer;
        anotheCustomer = customer;
        anotheCustomer.setBalance(12.18);
        System.out.println("Balance for customer: " + customer.getName() + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

        intList.add(1,2);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }

    }
}
