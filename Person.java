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
        setName(_name);
    }
    //endregion

    //region Encapsulation
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
}
