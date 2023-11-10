package Task3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class AirportNetwork {
    ArrayList<Airport> airports = new ArrayList<>();

    public ArrayList<Airport> getAirports() {
        return airports;
    }

    public void setAirports(ArrayList<Airport> airports) {
        this.airports = airports;
    }

    public void addAirport(Airport airport) {
        this.airports.add(airport);
    }

    public void createAirport(String cityName, ArrayList<FlightSchedule> flightSchedules, ArrayList<Plane> planes) {
        Airport airport = new Airport(cityName, flightSchedules, planes);
        this.airports.add(airport);
    }

    public void deleteAirport(Airport airport) {
        this.airports.remove(airport);
    }

    public void editAirport(Airport airport, String cityName) {
        airport.setCityName(cityName);
    }

    public void calculateIncomeFromTo(LocalDateTime from, LocalDateTime to) {
        double totalIncome = 0;
        for (Airport airport : this.airports) {
            for (FlightSchedule flightSchedule : airport.getFlightSchedules()) {
                for (Flight flight : flightSchedule.getFlights()) {
                    if ((flight.getDepartureTime().isAfter(from) || flight.getDepartureTime().isEqual(from))
                            && (flight.getArrivalTime().isBefore(to) || flight.getArrivalTime().isEqual(to))) {
                        totalIncome += flight.getTotalIncome();
                        for (Ticket ticket : flight.getTickets()) {
                            System.out.println("Task3.Ticket ID: " + ticket.getId() + ", Task3.Passenger: " + ticket.getFirstName() + " " + ticket.getLastName() + ", Price: " + ticket.getPrice());
                        }
                    }
                }
            }
        }
        System.out.println("Total income for the specified period: " + totalIncome);
    }


    public void printAirports() {
        for (Airport airport : this.airports) {
            System.out.println(airport.getCityName());
        }
    }
}
