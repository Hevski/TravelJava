import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    FlightManager flightManager;
    Flight flight1;
    Flight flight2;
    Plane plane1;
    Plane plane2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    ArrayList<Flight>flights;

    @Before
    public void setup() {
        flightManager = new FlightManager();
        flights = new ArrayList<Flight>();
        flightManager.setFlights(flights);
        flights.add(flight1);
        flights.add(flight2);
        plane1 = new Plane(PlaneType.FIGHTERJET, 5, 100);
        plane2 = new Plane(PlaneType.BOING007, 100, 800);
        flight1 = new Flight (plane1, "GLA261", "GRE", "GLA", "2:31");
        flight2 = new Flight (plane2, "GLA500", "USA", "GLA", "14:31");
        passenger1 = new Passenger("Heather", 1, flight1, 2);
        passenger2 = new Passenger("Angus", 1, flight1, 3);
        passenger3 = new Passenger("Betty", 2, flight1, 1);
        passenger4 = new Passenger("Doris", 1, flight1, 4);
        passenger5 = new Passenger("Mayble", 1, flight1, 5);
    }

    @Test
    public void hasFlights(){
        assertEquals(2, flightManager.countFlights());
    }

    @Test
    public void totalBaggageForFlight(){
        assertEquals(50, flightManager.countTotalBaggage(flight1));
    }

    @Test
    public void passengerShouldHaveSetBaggageWeightForFlight(){
        assertEquals(10, flightManager.bagWeightPerPerson(flight1));
    }

    @Test
    public void baggageWeightBookedByPassengersForFlight(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(20, flightManager.baggageBooked(flight1));
    }

    @Test
    public void baggageWeightRemainingForFlight(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(30, flightManager.baggageRemaining(flight1));
    }

    @Test
    public void canSortPassengersBySeatNumber(){
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        flight1.addPassenger(passenger3);
        flight1.addPassenger(passenger4);
        flight1.addPassenger(passenger5);
        passenger1.setSeatNo(2);
        passenger2.setSeatNo(3);
        passenger3.setSeatNo(1);
        passenger4.setSeatNo(4);
        passenger5.setSeatNo(5);
        ArrayList<Passenger> sortedPassengers = flightManager.sortPassengersBySeatNo(flight1);
        assertEquals(passenger3, sortedPassengers.get(0));
    }

}

