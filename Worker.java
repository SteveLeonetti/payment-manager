package paymentManager;

import java.util.Set;

public class Worker extends Person
{
    private int workID;
    private double rate;
    private Set<Client> clientSet;

    public Worker(String _name, int _workID, double _rate, Set<Client> _clientSet)
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
    }

    //region Encapsulation
    public int getWorkID() {
        return workID;
    }

    public void setWorkID(int workID) {
        this.workID = workID;
    }

    public Set<Client> getClientSet() {
        return clientSet;
    }

    public void setClientSet(Set<Client> clientSet) {
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
