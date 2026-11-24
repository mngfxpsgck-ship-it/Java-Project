public class Transaction{
    private String type;
    private String category;
    private int amount;
    private int createdAt;

    public Transaction(String category, int amount){
        this.category = category;
        this.amount = amount;
    }

}
