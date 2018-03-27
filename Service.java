package paymentManager;

/**
 * Service.  Parent class containing all shared data between all specific services.
 */

public class Service
{
    private Worker worker;
    private Client client;
    private double travel;

    //region Superclass
    public Service(Worker _worker, Client _client, double _travel)
    {
        setWorker(_worker);
        setClient(_client);
        setTravel(_travel);
    }
    //endregion

    //region Unused parent method (it's been overridden)
    public double getCost()
    {
        return 0;
    }
    //endregion

    //region Encapsulation
    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getTravel() {
        return travel;
    }

    public void setTravel(double travel) {
        this.travel = travel;
    }
    //endregion
}
