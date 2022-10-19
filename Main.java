public class Main {
    public static void main(String[] args) {

        Deposit deposit=new DepositAtm();
        deposit.depositAmount();
        Withdraw withdraw=new WithdrawalAtm();
        withdraw.withdrawAmount();

    }
}