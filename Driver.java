package paymentManager;

public class Driver
{
    public static void main(String[] args)
    {
        Person paul = new Worker("Paul", 0, 20);
        Person sam = new Client("Sam", (Worker)paul);

        Service mowSamsLawn = new MowLawn(((Client)sam).getWorker(), (Client)sam, 34, .5);
        System.out.print("Cost for Paul to mow Sam's lawn: $" + mowSamsLawn.getCost());
    }
}
