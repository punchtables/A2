package bank;

public class Stamp {

    private int clientId;
    private double balance;

    public Stamp(int clientId, double balance){
        this.clientId=clientId;
        this.balance=balance;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        return "Client " + clientId + " balance: " + balance + " kr";
    }
}
