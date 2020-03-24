package Q5;
public class Q5Main {
    public static void main(String[] args){
      
        FinancialRecord a = new FinancialRecord();
        a.setAnnualInterestRate(8.0);
        a.setBalance(20000);
        a.setId(1001);
        a.setWithdrawalAmount(500);
        a.setDepositAmount(1500);
        a.displayRecordInfo();
        
    }
}
