import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransactions(initialAmount);
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

    public String getName() {
        return this.name;
    }

    public void addTransactions(double amount){
        this.transactions.add(amount);
    }

}
