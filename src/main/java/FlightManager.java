import java.util.ArrayList;

public class FlightManager {

    private ArrayList<Flight> flights;

    public FlightManager(){
        this.flights = new ArrayList<Flight>();
    }


    public void setFlights(ArrayList<Flight> flights) {
        this.flights = flights;
    }

    public Object countFlights() {
        return this.flights.size();
    }

    public int bagWeightPerPerson(Flight flight) {
        return flight.getPlane().getTotalWeight() / 2 / flight.getPlane().getCapacity();
    }

    public int baggageBooked(Flight flight) {
        return bagWeightPerPerson(flight) * flight.countPassengers();
    }

    public int countTotalBaggage(Flight flight1) {
        return flight1.getPlane().getTotalWeight() / 2;
    }

    public int baggageRemaining(Flight flight) {
        return countTotalBaggage(flight) - baggageBooked(flight);
    }
}
