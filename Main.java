public class Main{
    public static void main(String[] args) {
        Account account = new Account("123-123456", 50000);
        Manager manager = new Manager();

        manager.recordIncome("음식", 5, account);
        manager.recordIncome("기타", 10, account);
        manager.recordExpense("운동", 50, account);

        manager.printLedger();
    }
}