package paymentManager;

import java.util.HashSet;

public class Worker extends Person
{
    private int workID;
    private double rate;
    private HashSet<Client> clientSet;


    //region Inheritance
    public Worker(String _name, int _workID, double _rate, HashSet<Client> _clientSet)
    {
        super(_name);
        setWorkID(_workID);
        setClientSet(_clientSet);
        setRate(_rate);
    }

    public Worker(String _name, int _workID, double _rate)
    {
        super(_name);
        setWorkID(_workID);
        setRate(_rate);
        clientSet = new HashSet<>();
    }
    //endregion

    /**
     * Adds a client to the worker's client set
     * @param client
     */
    public void addClient(Client client)
    {
        clientSet.add(client);
        client.setWorker(this);
    }
    //region Encapsulation
    public int getWorkID() {
        return workID;
    }

    public void setWorkID(int workID) {
        this.workID = workID;
    }

    public HashSet<Client> getClientSet() {
        return clientSet;
    }

    public void setClientSet(HashSet<Client> clientSet) {
        this.clientSet = clientSet;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
    //endregion
}
