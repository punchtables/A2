package bank;

public class Client extends Thread{

    private int id;
    private BankAccount bankAccount;
    private double totalAmountTransactioned = 0;
    private boolean operating = true;

    public Client(BankAccount bankAccount, int id){
        this.bankAccount=bankAccount;
        this.id=id;
    }

    @Override
    public void run(){
        while(operating){
            try {
                bankAccount.Transaction(100, id);
                totalAmountTransactioned = totalAmountTransactioned + 100;
                System.out.println("Total amount transactioned for client " + id + ": " + totalAmountTransactioned);
                Thread.sleep(1000);
            }catch(Exception e){}
        }
    }

    public int getid() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public double getTotalAmountTransactioned() {
        return totalAmountTransactioned;
    }

    public void setTotalAmountTransactioned(double totalAmountTransactioned) {
        this.totalAmountTransactioned = totalAmountTransactioned;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }
}
