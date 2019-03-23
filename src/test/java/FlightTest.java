import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Passenger passenger6;


    @Before
    public void setup(){
        plane = new Plane(PlaneType.BARELYLEGAL, 5, 200);
        flight = new Flight (plane, "GLA261", "GRE", "GLA", "2:31");
        passenger1 = new Passenger("Heather", 1, flight, 2);
        passenger2 = new Passenger("Angus", 1, flight, 3);
        passenger3 = new Passenger("Betty", 2, flight, 1);
        passenger4 = new Passenger("Doris", 1, flight, 4);
        passenger5 = new Passenger("Mayble", 1, flight, 5);
        passenger6 = new Passenger("Frank", 1, flight, 3);
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
        assertEquals(5, flight.availableSeats());
    }

    @Test
    public void canAddPassenger__availableSeats(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.countPassengers());
        assertEquals(4, flight.availableSeats());
    }

    @Test
    public void cantAddPassenger__noAvailableSeats(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flight.addPassenger(passenger5);
        flight.addPassenger(passenger6);
        assertEquals(5, flight.countPassengers());
        assertEquals(0, flight.availableSeats());
    }

//    @Test
//    public void doesntDoublicateSeatNumbers(){
//
//    }
//
//    @Test
//    public void canAssignUniqueSeatNumber(){
//        flight.addPassenger(passenger1);
//        assertEquals(3, flight.assignUniqueSeatNo());
//    }
}
