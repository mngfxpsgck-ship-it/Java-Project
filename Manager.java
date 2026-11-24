import java.util.ArrayList;
import java.util.List;

public class Manager{
    private int account;
    private List<String> ledger = new ArrayList<>();

    public void recordIncome(String category, int amount, Account account){
        int runDeposit = account.deposit(amount);  // deposit 실행 후 리턴값 저장

        if(runDeposit == 0){
            ledger.add(category + ": " + amount + "원");

            System.out.println("--------------[장부]--------------");
            System.out.println(String.join("\n", ledger));
            System.out.println("----------------------------------\n\n");
        }  // 입금 금액이 0 이상이면 영수증 추가

        else if (runDeposit == -1){
            return;
        }  // 입금 금액이 0 아래면 그냥 return
    }
}
