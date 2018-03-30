package paymentManager;

import java.util.HashSet;

/**
 * Client.  Stores information about the client of the worker.
 */

public class Client extends Person
{
    //region Fields
    private Worker worker;
    private HashSet<Service> services;
    //endregion

    //region Inheritance
    public Client(String _name, Worker _worker)
    {
        super(_name);
        worker = _worker;
        worker.addClient(this);
        setServices(new HashSet<>());
    }

    public Client(String _name)
    {
        super(_name);
        setServices(new HashSet<>());
    }
    //endregion

    //region Manipulation

    /**
     * Confirms the ability to add the service to the client's service list.
     * @param service
     * @return
     */
    private boolean confirmSuitableAddition(Service service)
    {
        if (!getServices().contains(service) && service.getClient().equals(this) && service.getWorker().equals(this.worker))
            return true;

        return false;
    }

    /**
     * Adds service to the client's service list.
     * @param service to be added
     * @return success of addition
     */
    public boolean addService(Service service)
    {
        if (this.confirmSuitableAddition(service))
        {
            getServices().add(service);
            return true;
        }

        return false;
    }

    /**
     * Removes service from the client's service list.
     * @param service to be removed
     * @return success of removal
     */
    public boolean removeService(Service service)
    {
        if (getServices().contains(service))
        {
            getServices().remove(service);
            return true;
        }

        return false;
    }
    //endregion

    //region Overriding
    public String toString()
    {
        return this.getName();
    }
    //endregion

    //region Encapsulation
    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker _worker) {
        this.worker = _worker;
    }

    public HashSet<Service> getServices() {
        return services;
    }

    public void setServices(HashSet<Service> services) {
        this.services = services;
    }
    //endregion
}
