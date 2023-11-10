package Task3;

import java.time.LocalDateTime;
import java.util.ArrayList;
public class Main {
    public static void main(String... args) {

        Plane plane1 = new Plane("Windsor", "Boeing 737", "good");
        Flight flight1 = new Flight(LocalDateTime.of(2020, 10, 13, 11, 11),
                LocalDateTime.of(2020, 10, 14, 11, 11),
                "Kyiv", "Lviv", plane1);
        flight1.addTicket("John", "Doe");
        flight1.addTicket("Mary", "Doe");
        flight1.addTicket("Petro", "Doe");

        System.out.println("Before editing ticket");
        flight1.printFlightInfo();

        System.out.println();
        System.out.println();

        System.out.println("After deleting ticket");
        flight1.cancelTicket("John", "Doe");
        flight1.printFlightInfo();

        System.out.println("====================================");
        System.out.println();

        Flight flight2 = new Flight(LocalDateTime.of(2020, 10, 15, 11, 11),
                LocalDateTime.of(2020, 10, 16, 11, 11),
                "Kyiv", "NewYork", plane1);

        FlightSchedule flightScheduleKyivMorning = new FlightSchedule();
        flightScheduleKyivMorning.addFlight(flight1);

        flight2.addTicket("Yana", "Nashchetska");
        flight2.addTicket("Olenka", "Pyatkovska");
        flightScheduleKyivMorning.addFlight(flight2);

        flightScheduleKyivMorning.printSchedule();

        System.out.println();
        System.out.println();

        System.out.println("After editing ticket");
        flight2.editTicket("Yana", "Nashchetska", "Jane", "Winchester");
        System.out.println();

        flightScheduleKyivMorning.printSchedule();

        System.out.println();
        System.out.println();

        System.out.println("After deleting flight1");
        flightScheduleKyivMorning.deleteFlight(flight1);

        flightScheduleKyivMorning.printSchedule();

        flightScheduleKyivMorning.editFlight(flight2, "Kansas-city");
        System.out.println("After editing flight2");
        flightScheduleKyivMorning.printSchedule();

        System.out.println("====================================");
        System.out.println();

        Plane plane2 = new Plane("Windsor", "Boeing 737", "good");

        FlightSchedule flightScheduleKyivEvening = new FlightSchedule();


        ArrayList <FlightSchedule> flightSchedulesKyiv = new ArrayList<>();
        flightSchedulesKyiv.add(flightScheduleKyivMorning);
        flightSchedulesKyiv.add(flightScheduleKyivEvening);

        ArrayList<Plane> planesKyiv = new ArrayList<>();
        planesKyiv.add(plane1);
        planesKyiv.add(plane2);

        Airport airportKyiv = new Airport("Kyiv", flightSchedulesKyiv, planesKyiv);

        airportKyiv.editPlane(plane2, "bad");
        Flight flight3 = new Flight(LocalDateTime.of(2020, 10, 17, 11, 11),
                LocalDateTime.of(2020, 10, 19, 11, 11),
                "Kyiv", "Lviv", plane2);

        flightScheduleKyivMorning.addFlight(flight3);
        flightScheduleKyivMorning.printSchedule();

        Plane plane3 = new Plane("Windsor", "Boeing 737", "good");
        airportKyiv.addPlane(plane3);

        System.out.println("====================================");
        airportKyiv.printPlanes();

        AirportNetwork airports = new AirportNetwork();
        airports.addAirport(airportKyiv);

        System.out.println("====================================");

        Plane plane5 = new Plane("AN", "MRIJA 225", "good");
        Flight flight5 = new Flight(LocalDateTime.of(2020, 10, 19, 11, 11),
                LocalDateTime.of(2020, 10, 20, 13, 11),
                "Kyiv", "Lviv", plane5);

        ArrayList <Plane> planesLviv = new ArrayList<>();
        planesLviv.add(plane5);
        FlightSchedule Morning = new FlightSchedule();
        ArrayList <FlightSchedule> flightSchedulesLviv = new ArrayList<>();
        flightSchedulesLviv.add(Morning);
        Morning.addFlight(flight5);

        Airport airportLviv = new Airport("Lviv", flightSchedulesLviv, planesLviv);
        airports.addAirport(airportLviv);

        airports.editAirport(airportLviv, "International Airport named after Danylo Halytsky");
        airports.printAirports();

        flight5.addTicket("Dean", "Winchester");
        flight5.addTicket("Sam", "Winchester");
        Morning.printSchedule();


        System.out.println("====================================");
        airports.calculateIncomeFromTo(LocalDateTime.of(2020, 10, 11, 11, 11),
                LocalDateTime.of(2020, 10, 22, 22, 11));

        System.out.println("====================================");

        airportKyiv.deletePlane(plane3);
        airportLviv.printPlanes();

        airports.deleteAirport(airportKyiv);
        airports.printAirports();
    }
}
