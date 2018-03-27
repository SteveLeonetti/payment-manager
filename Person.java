package paymentManager;

/**
 * Person.  Parent class of Worker and Client.  Stores all shared data between its children.
 */

public class Person
{
    private String name;

    public Person(String _name)
    {
        name = _name;
    }
}
