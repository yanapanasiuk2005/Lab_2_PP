package Task3;

import java.util.UUID;
public class Passenger extends Person{
    final private UUID id = UUID.randomUUID();

    public Passenger(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public UUID getId() {
        return id;
    }



    @Override
    public String toString() {
        return "Task3.Passenger: " + '\n' +
                "id = " + id + '\n' +
                "firstName: " + getFirstName() + '\n' +
                "lastName: " + getLastName() + '\n';
    }
}

