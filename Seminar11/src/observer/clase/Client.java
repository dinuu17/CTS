package observer.clase;

public class Client implements IClient{
    String numeClient;
    public Client(String numeClient)
    {
        this.numeClient=numeClient;
    }
    @Override
    public void afiseazaMesaj(String mesaj) {

    }
}
