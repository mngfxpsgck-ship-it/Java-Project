import java.util.ArrayList;
import java.util.List;

public class Manager{
    private int account;
    private List<String> ledger = new ArrayList<>();

    public void recordIncome(int amount,String category){  // TODO : 계좌에 입금 했을떄 실행 되게 만들기
        ledger.add(category + ": " + amount + "원");

        System.out.println(ledger);  // TODO : 11번 줄 테스트 후 삭제
    }
}
