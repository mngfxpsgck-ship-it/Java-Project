public class Main{
    public static void main(String[] args) {
        Account account = new Account("123-123456", 50000);

        account.withdraw(324); // withdraw test

        int getBalance_test = account.getBalance();
        System.out.println(getBalance_test);
    }
}