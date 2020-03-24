package Q5;
public class FinancialRecord {
    private int id ;
    private double balance,withdrawalAmount,depositAmount;
    private double annualInterestRate;

    public FinancialRecord() {
    }

    public FinancialRecord(int id, double balance) {
        id = 0;
        balance = 0;
    }
    public int getId() {
        return id;
    }
     
    public double getBalance() {
        return balance;
    }
   
    public double getWithdrawalAmount() {
        return withdrawalAmount;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWithdrawalAmount(double withdrawalAmount) {
        this.withdrawalAmount = withdrawalAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate(double annual){
        return annual/12;
    }
    public void withdraw(double amount){
        System.out.print("Current balance after withdrawal of RM"+"is:RM"+amount);
    }
    public void displayRecordInfo(){
        System.out.println("The information about financial record A " +" is as follows: ");
        System.out.println("Financial record id is: "+getId());
        System.out.println("Financial record balance is:RM"+getBalance());
        System.out.println("Annual interest rate is: "+getAnnualInterestRate());
        System.out.println("The monthyly interest rate is:"+getMonthlyInterestRate(annualInterestRate));
        System.out.println("Previuos balance:RM"+getBalance());
        setBalance(getBalance()+getDepositAmount());
        System.out.println("Current balance after deposit of RM"+ getDepositAmount()+" is:RM"+getBalance());
        System.out.println("Previous balance:RM"+getBalance());
        setBalance(getBalance()-getWithdrawalAmount());
        System.out.println("Current balance after withdrawal of RM"+getWithdrawalAmount()+" is:RM"+getBalance());
       
    }
}
