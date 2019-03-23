import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;
    Flight flight1;
    Flight flight2;
    Plane plane1;
    Plane plane2;

    @Before
    public void setup(){
        plane1 = new Plane(PlaneType.FIGHTERJET, 2, 100);
        plane2 = new Plane(PlaneType.BOING007, 100, 800);
        flight1 = new Flight (plane1, "GLA261", "GRE", "GLA", "2:31");
        flight2 = new Flight (plane2, "GLA500", "USA", "GLA", "14:31");
        passenger1 = new Passenger("Heather", 1, flight1, 2);
        passenger2 = new Passenger("Angus", 1, flight2, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Heather", passenger1.getName());
    }

    @Test
    public void canGetNoOfBags(){
        assertEquals(1, passenger1.getBags());
    }

    @Test
    public void canGetFlight(){
        assertEquals(flight1, passenger1.getFlight());
    }

    @Test
    public void canSetFlight(){
        passenger1.setFlight(flight2);
        assertEquals(flight2, passenger1.getFlight());
    }

    @Test
    public void canGetSeatNumber() {
        assertEquals(3, passenger2.getSeatNo());
    }

    @Test
    public void canSetSeatNumber(){
        passenger1.setSeatNo(3);
        assertEquals(3, passenger1.getSeatNo());
    }
}
