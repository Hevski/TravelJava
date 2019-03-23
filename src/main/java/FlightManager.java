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

    public int countTotalBaggage(Flight flight) {
        return flight.getPlane().getTotalWeight() / 2;
    }

    public int baggageRemaining(Flight flight) {
        return countTotalBaggage(flight) - baggageBooked(flight);
    }

    public ArrayList<Passenger> sortPassengersBySeatNo(Flight flight) {
        ArrayList<Passenger> sortedPassengers = flight.getPassengers();
        Passenger temp;
        for (int i = sortedPassengers.size() -1; i > 0; i--){

            boolean isSorted = true;

            for (int j = 0; j < i; j++){
                if (sortedPassengers.get(j + 1).getSeatNo() < sortedPassengers.get(j).getSeatNo()){
                    isSorted = false;
                    temp = sortedPassengers.get(j + 1);
                    sortedPassengers.set(j + 1, sortedPassengers.get(j));
                    sortedPassengers.set(j, temp);
                }
            }
            if (isSorted){
                break;
            }
        }
        return sortedPassengers;
    }

}
