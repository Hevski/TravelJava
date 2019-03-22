import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger1;
    Passenger passenger2;

    @Before
    public void setup(){
        passenger1 = new Passenger("Heather", 1);
        passenger2 = new Passenger("Angus", 1);
    }

    @Test
    public void canGetName(){
        assertEquals("Heather", passenger1.getName());
    }

    @Test
    public void canGetNoOfBags(){
        assertEquals(1, passenger1.getBags());
    }
}
