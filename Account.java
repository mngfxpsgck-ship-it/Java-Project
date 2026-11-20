public class Account{
    private String accountNumber;
    private int balance;

    public Account(String accountNumber){
        this.accountNumber = accountNumber;
        balance = 0;
    }

    public Account(String accountNumber, int balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int deposit(int money){
        if(money > 0){
            balance += money;

            System.out.println("[계좌] " + accountNumber + ": " + money + "원이 입금 됐습니다.");
            System.out.println("[계좌] " + accountNumber + ": " + balance + "원.");

            return 0;  // 입금 금액 0 초과시 0 반환
        }

        else if(money <= 0){
            System.out.println("최소 0원 초과부터 입금이 가능합니다.");

            return -1;  // 입금 금액 0 이하시 -1 반환
        }
        return -9;  // error
    }
}


