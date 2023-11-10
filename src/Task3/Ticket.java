package Task3;

import java.time.LocalDateTime;
public class Ticket extends Passenger {
    final private double price;

    public Ticket(String firstName, String lastName, LocalDateTime departureTime, LocalDateTime arrivalTime) {
        super(firstName, lastName);
        if (arrivalTime.getDayOfMonth() - departureTime.getDayOfMonth() == 0) {
            this.price = 100;
        } else if (arrivalTime.getDayOfMonth() - departureTime.getDayOfMonth() == 1) {
            this.price = 200;
        } else {
            this.price = 300;
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {


        return "\nTask3.Ticket :" + '\n' +
                "Task3.Passenger info :" + '\n' +
                "id = " + getId() + '\n' +
                "firstName: " + getFirstName() + '\n' +
                "lastName: " + getLastName() + '\n' +
                "price: " + price;
    }
}
