package paymentManager;

import java.util.HashSet;

public class Driver
{
    public static void main(String[] args)
    {
        Person paul = new Worker("Paul", 0, 20);
        Person sam = new Client("Sam", (Worker)paul);

        Service mowSamsLawn = new MowLawn(((Client)sam).getWorker(), (Client)sam, 34, .5);
        Service powerWashSamsHouse = new PowerWash(((Client)sam).getWorker(), (Client)sam, 34, 600);
        System.out.println("Cost for Paul to mow Sam's lawn: \n" + PaymentCalculator.tallyCost(mowSamsLawn));
        System.out.println("Cost for Paul to power wash Sam's house: \n" + PaymentCalculator.tallyCost((powerWashSamsHouse)));

        ((Client) sam).addService(mowSamsLawn);
        ((Client) sam).addService(powerWashSamsHouse);

        System.out.println();

        System.out.println(mowSamsLawn);
        System.out.println(powerWashSamsHouse);

        System.out.println();

        System.out.println("Cost for Paul to do both jobs: \n" + PaymentCalculator.tallyCost(((Client)sam).getServices()));
    }
}
