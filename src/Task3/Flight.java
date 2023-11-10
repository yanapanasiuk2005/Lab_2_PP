package Task3;

import java.time.LocalDateTime;
import java.util.ArrayList;
public class Flight {
    private ArrayList<Ticket> tickets = new ArrayList<>();

    final private LocalDateTime departureTime;
    final private LocalDateTime arrivalTime;
    final private String depCity;
    private String arrCity;
    final private Plane plane;

    private double totalIncome;

    public void setArrCity(String arrCity) {
        this.arrCity = arrCity;
    }
    public Flight(LocalDateTime departureTime, LocalDateTime arrivalTime, String depCity, String arrCity, Plane plane) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.depCity = depCity;
        this.arrCity = arrCity;
        this.plane = plane;
    }


    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public  void calculateTotalIncome() {
        this.totalIncome = tickets.get(0).getPrice() * tickets.size();

    }

    public void addTicket(String firstName, String lastName) {
        Ticket ticket = new Ticket(firstName, lastName, this.departureTime, this.arrivalTime);
        this.tickets.add(ticket);
        calculateTotalIncome();
    }

    public void editTicket(String firstName, String lastName, String newFirstName, String newLastName) {
        for(Ticket ticket : this.tickets) {
            if (ticket.getFirstName().equals(firstName) && ticket.getLastName().equals(lastName)) {
                ticket.setFirstName(newFirstName);
                ticket.setLastName(newLastName);
                break;
            }
        }
    }

    public void cancelTicket(String firstName, String lastName) {
        for(Ticket ticket : this.tickets) {
            if (ticket.getFirstName().equals(firstName) && ticket.getLastName().equals(lastName)) {
                this.tickets.remove(ticket);
                calculateTotalIncome();
                break;
            }
        }
    }

    public void printFlightInfo() {
        System.out.println(this);
    }


    @Override
    public String toString() {

        return "Task3.Flight from " + depCity + " to " + arrCity + '\n' +
                "departureTime :" + departureTime + '\n' +
                "arrivalTime :" + arrivalTime + '\n' +
                "plane : " + plane +
                "tickets : " + tickets +
                "totalIncome : " + totalIncome;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }
    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }
    //==================================================================================================================
    public Ticket[] getTickets() {
        return tickets.toArray(new Ticket[0]);
    }
}
