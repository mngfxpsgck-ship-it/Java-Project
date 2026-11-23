public class Transaction{
    private String type;
    private String category;
    private int amount;
    private int createdAt;

    public Transaction(){
        category = "음식";
        amount = 300;
    }

    public void test(Manager manager){
        manager.recordIncome(amount, category);
    }  // TODO : recordIncome 테스트 (테스트 후 삭제)
}
