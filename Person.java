package paymentManager;

/**
 * Person.  Parent class of Worker and Client.  Stores all shared data between its children.
 */

public class Person
{
    //region Fields
    private String name;
    //endregion

    //region Superclass
    public Person(String _name)
    {
        name = _name;
    }
    //endregion
}
