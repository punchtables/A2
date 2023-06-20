package bank;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private BankAccount account = new BankAccount();
    private List<Client> clients = new ArrayList<>();

    public void StartClients(){
        Client client1 = new Client(account, 1);
        clients.add(client1);
        Client client2 = new Client(account, 2);
        clients.add(client2);
        int i = 0;
        client1.start();
        client2.start();
    }
    public void Wait(){

    }
    public void StopClients(){

    }
    public void GatherResults(){

    }


    public static void main(String[] args) {
        Main main = new Main();
        main.StartClients();
    }
}