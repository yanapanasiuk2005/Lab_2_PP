package Task3;

import java.util.ArrayList;
public class Airport {
    private String cityName;
    final private ArrayList<FlightSchedule> flightSchedules;

    final private ArrayList<Plane> planes;

    public Airport(String cityName, ArrayList<FlightSchedule> flightSchedules, ArrayList<Plane> planes) {
        this.cityName = cityName;
        this.flightSchedules = flightSchedules;
        this.planes = planes;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public ArrayList<FlightSchedule> getFlightSchedules() {
        return flightSchedules;
    }

    public void addPlane(Plane plane) {
        this.planes.add(plane);
    }

    public void editPlane(Plane plane, String status) {
        plane.setStatus(status);
        if (status.equals("good")) {
            System.out.println("Safe fly");
        } else {
            System.out.println("Danger to fly on this plane");
        }
    }

    public void printPlanes() {
        for (Plane plane : this.planes) {
            System.out.println(plane);
        }
    }


    public void deletePlane(Plane plane3) {
        this.planes.remove(plane3);
    }
}
