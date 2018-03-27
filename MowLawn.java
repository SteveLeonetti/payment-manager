package paymentManager;

/**
 * Mow Lawn.  Contains all data needed for calculation of service cost, except the worker's standard rate.
 */

public class MowLawn extends Service
{
    //region Fields
    private double acres;
    //endregion

    //region Inheritance
    public MowLawn(Worker _worker, Client _client, double _travel, double _acres)
    {
        super(_worker, _client, _travel);
        setAcres(_acres);
    }
    //endregion

    //region Overriding
    /**
     * Calculates the expected cost of the job
     * @return cost
     */
    public double getCost()
    {
        // Every acre takes 3 hours to finish.  18 miles/gal, $2.67 per gallon.
        return 3 * acres * getWorker().getRate() + (getTravel() / 18 * 2.67);
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
