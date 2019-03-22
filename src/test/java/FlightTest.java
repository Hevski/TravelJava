import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;


    @Before
    public void setup(){
        plane = new Plane(PlaneType.BARELYLEGAL, 1, 200);
        flight = new Flight (plane, "GLA261", "GRE", "GLA", "2:31");
        passenger1 = new Passenger("Heather", 1);
        passenger2 = new Passenger("Angus", 1);
    }

    @Test
    public void canGetPlane(){
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("GLA261", flight.getFlightNo());
    }

    @Test
    public void canGetDestination(){
        assertEquals("GRE", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime(){
        assertEquals("2:31", flight.getDepartureTime());
    }

    @Test
    public void canCountNoOfPassengers(){
        assertEquals(0, flight.countPassengers());
    }

    @Test
    public void canCheckNumberOfAvailableSeats(){
        assertEquals(1, flight.availableSeats());
    }

    @Test
    public void canAddPassenger__availableSeats(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.countPassengers());
        assertEquals(0, flight.availableSeats());
    }

    @Test
    public void cantAddPassenger__noAvailableSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(1, flight.countPassengers());
        assertEquals(0, flight.availableSeats());
    }
}
