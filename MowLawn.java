package paymentManager;

/**
 * Mow Lawn.  Contains all data needed for calculation of service cost, except the worker's standard rate.
 */

public class MowLawn extends Service implements Taxable
{
    private double acres;

    //region Construction
    public MowLawn(Worker _worker, Client _client, double _travel, double _acres)
    {
        super(_worker, _client, _travel);
        setAcres(_acres);
    }
    //endregion

    //region Encapsulation
    public double getAcres() {
        return acres;
    }

    public void setAcres(double acres) {
        this.acres = acres;
    }
    //endregion
}
