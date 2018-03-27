package paymentManager;

import java.util.ArrayList;

/**
 * Payment Calculator.  Handles calculation of prices of single or multiple service bills.
 */

public abstract class PaymentCalculator
{

    //region Overloaded method
    /**
     * Calculate cost of a single service
     * @param service
     * @return total cost
     */
    public double tallyCost(Service service)
    {
        double totalCost = (service instanceof Taxable ? service.getCost() * Taxable.rate : service.getCost());
        return 0.0;
    }

    /**
     * Calculate cost of multiple services
     * @param services
     * @return total cost
     */
    public double tallyCost(ArrayList<Service> services)
    {
        return 0.0;
    }
    //endregion
}
