package paymentManager;

import java.util.Set;

public class Worker extends Person
{
    private int workID;
    private Set<Client> clientSet;

    public Worker(String _name, int _workID, Set<Client> _clientSet)
    {
        super(_name);
        setWorkID(_workID);
        setClientSet(_clientSet);
    }

    public Worker(String _name, int _workID)
    {
        super(_name);
        setWorkID(_workID);
    }

    /* Encapsulation */
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
}
