/**
        * Represents a person with a full name that can be queried for their initials.
        */
public class Person {
    /**
     * The person's full name. Must not be null after object construction.
     **/
    private final String fullName;

    /**
     * Constructs a new Person.
     *
     * @param fullName the person's full name, with components separated
     *                 by spaces
     * @throws NullPointerException if fullName is null
     */
    public Person(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Returns this person's initials based on their full name.
     *
     * @return this person's initials based on their full name
     */
    public String getInitials() {
        return null;
    }
}