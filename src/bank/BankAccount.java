package bank;

public class BankAccount {

    private int balance = 0;
    private Security security;
    private int numberOfTransactions = 0;

    public BankAccount(){
        security = new Security();
    }

    public void Transaction(int sum, int clientId){
        Object object = new Object();
        synchronized (object) {
            security.MakePreTransactionStamp(balance, clientId);
            balance = balance + sum;
            security.MakePostTransactionStamp(balance, clientId);
            security.VerifyLastTransaction(sum);
            numberOfTransactions++;
        }

    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

}
