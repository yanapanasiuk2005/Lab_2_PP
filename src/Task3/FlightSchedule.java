package Task3;

import java.time.LocalDateTime;
import java.util.ArrayList;
public class FlightSchedule {
    ArrayList<Flight> flights = new ArrayList<>();

    public FlightSchedule() {
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public void addFlight(Flight flight){
        this.flights.add(flight);
    }

    public void deleteFlight(Flight flight){
        this.flights.remove(flight);
    }

    public void editFlight(Flight flight, String arrCity) {
        flight.setArrCity(arrCity);

    }

    public void printSchedule() {
        for (Flight flight : this.flights) {
            flight.printFlightInfo();
            System.out.println();
        }
    }
}
