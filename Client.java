package paymentManager;

/**
 * Client.  Stores information about the client of the worker.
 */

public class Client extends Person
{
    //region Fields
    private Worker worker;
    //endregion

    //region Inheritance
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
    //endregion

    //region Encapsulation
    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker _worker) {
        this.worker = _worker;
    }
    //endregion
}
