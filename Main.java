public class Main{
    public static void main(String[] args) {
        Account account = new Account("123-123456", 50000);
        Transaction transaction = new Transaction();
        Manager manager = new Manager();

        transaction.test(manager);
    }
}