package paymentManager;

import java.util.HashSet;

public class Driver
{
    public static void main(String[] args)
    {
        Person paul = new Worker("Paul", 0, 20);
        Person sam = new Client("Sam", (Worker)paul);

        Service mowSamsLawn = new MowLawn(((Client)sam).getWorker(), (Client)sam, 34, .5);
        Service powerWashSamsHouse = new PowerWash(((Client)sam).getWorker(), (Client)sam, 34, 3000);
        System.out.println("Cost for Paul to mow Sam's lawn: " + PaymentCalculator.tallyCost(mowSamsLawn));
        System.out.println("Cost for Paul to clean Sam's house: " + PaymentCalculator.tallyCost((powerWashSamsHouse)));

        HashSet<Service> list = new HashSet<>();
        list.add(mowSamsLawn);
        list.add(powerWashSamsHouse);

        System.out.println("Cost for Paul to do both jobs: " + PaymentCalculator.tallyCost(list));
    }
}
