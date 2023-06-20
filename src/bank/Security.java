package bank;
import java.util.ArrayList;
import java.util.List;

public class Security {

    private List<Stamp> transactionHistory =  new ArrayList<>();
    private int numberOfErrors = 0;
    private BankAccount account;
    private Stamp preStamp;
    private Stamp postStamp;


    public Security(){

    }

    public void MakePreTransactionStamp(int balance, int clientId){
        preStamp = new Stamp(clientId, balance);
        System.out.println("PreTransaction: " + preStamp.toString());
    }
    public void MakePostTransactionStamp(int balance, int clientId){

        postStamp = new Stamp(clientId, balance);
        System.out.println("PostTransaction: " + postStamp.toString());
    }
    public void VerifyLastTransaction(int sum){
            if(preStamp.getBalance() != (postStamp.getBalance()-sum)){
                numberOfErrors++;
                System.out.println("Number of errors: " + numberOfErrors);
            }
    }

}
