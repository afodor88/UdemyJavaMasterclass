public class App {
    public static void main(String[] args) throws Exception {
        // Account myDefaultAccount = new Account();
        // Account myBankAccount = new Account("12345", 0.00, "Bob Brown", "myemail@alex.com", "0733123215");

        // System.out.println(myBankAccount.getNumber());
        // System.out.println(myBankAccount.getBalance());
        // myBankAccount.withdraw(100.0);

        // myBankAccount.deposit(50.0);
        // myBankAccount.withdraw(100.0);

        // myBankAccount.deposit(51.0);
        // myBankAccount.withdraw(100.0);

        // Account timsAccount = new Account("Tim", "tim@email.com", "12345");
        // System.out.println(timsAccount.getBalance() + " name " + timsAccount.getCustomerName());


        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());

    }
}
