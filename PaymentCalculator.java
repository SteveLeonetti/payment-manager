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
        double cost = service.getCost();
        double tax = (service instanceof Taxable ? service.getCost() * Taxable.rate : 0);
        double total = cost + tax;

        return "Cost: " + NumberFormat.getCurrencyInstance().format(cost)
                + " || Tax: " + NumberFormat.getCurrencyInstance().format(tax)
                + " || Total: " + NumberFormat.getCurrencyInstance().format(total);
    }

    /**
     * Calculate cost of multiple services
     * @param services
     * @return total cost
     */
    public static String tallyCost(HashSet<Service> services)
    {
        String costString = "";
        double totalCost = 0;

        for (Service service : services)
        {
            costString += service.toString() + tallyCost(service) + "\n\n";
            totalCost += (service instanceof Taxable ? service.getCost() + service.getCost() * Taxable.rate : service.getCost());
        }

        return costString + "\n" + " **TOTAL COST: " + NumberFormat.getCurrencyInstance().format(totalCost) + "**";
    }
    //endregion
}
