package paymentManager;

/**
 * Power Wash.  Contains all data needed for calculation of service cost, except the worker's standard rate.
 */

public class PowerWash extends Service implements Taxable
{
    private double area;

    //region Construction
    public PowerWash(Worker _worker, Client _client, double _travel, double _area)
    {
        super(_worker, _client, _travel);
        setArea(_area);
        setTravel(_travel);
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
