package paymentManager;

public class Client extends Person
{
    private Worker worker;

    public Client(String _name, Worker _worker)
    {
        super(_name);
        worker = _worker;
        worker.addClient(this);
    }

    public Client(String _name)
    {
        super(_name);
    }

    /* Encapsulation */
    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker _worker) {
        this.worker = _worker;
    }
}
