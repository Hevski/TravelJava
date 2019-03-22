import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger>passengers;
    private Plane plane;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight (Plane plane, String flightNo, String destination, String departureAirport, String departureTime) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }


    public String getDepartureAirport() {
        return departureAirport;
    }


    public String getDepartureTime() {
        return departureTime;
    }

    public int countPassengers(){
        return this.passengers.size();
    }

    public int availableSeats() {
        return plane.getCapacity() - passengers.size();
    }

    public void addPassenger(Passenger passenger) {
        if (this.plane.getCapacity() > countPassengers()){
            this.passengers.add(passenger);
        }
    }
}
