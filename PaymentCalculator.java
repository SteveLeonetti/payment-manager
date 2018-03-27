package paymentManager;

import java.text.NumberFormat;
import java.util.HashSet;

/**
 * Payment Calculator.  Handles calculation of prices of single or multiple service bills.
 */

public abstract class PaymentCalculator
{

    //region Overloading
    /**
     * Calculate cost of a single service
     * @param service
     * @return total cost
     */
    public static String tallyCost(Service service)
    {
        double totalCost = (service instanceof Taxable ? service.getCost() * Taxable.rate : service.getCost());
        return NumberFormat.getCurrencyInstance().format(totalCost);
    }

    /**
     * Calculate cost of multiple services
     * @param services
     * @return total cost
     */
    public static String tallyCost(HashSet<Service> services)
    {
        double totalCost = 0;

        for (Service service : services)
        {
            totalCost += (service instanceof Taxable ? service.getCost() * Taxable.rate : service.getCost());
        }

        return NumberFormat.getCurrencyInstance().format(totalCost);
    }
    //endregion
}
