package paymentManager;

/**
 * Power Wash.  Contains all data needed for calculation of service cost, except the worker's standard rate.
 */

public class PowerWash extends Service implements Taxable
{
    private double area;

    //region Inheritance
    public PowerWash(Worker _worker, Client _client, double _travel, double _area)
    {
        super(_worker, _client, _travel);
        setArea(_area);
        setTravel(_travel);
    }
    //endregion

    //region Overriding
    public double tallyCost()
    {
        // Every square foot takes 30 seconds to finish.
        return (area / 120) * getWorker().getRate();
    }
    //endregion

    //region Encapsulation
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    //endregion
}
