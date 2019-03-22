import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void setup(){
        plane = new Plane(PlaneType.BARELYLEGAL, 100, 200);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BARELYLEGAL, plane.getPlane());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, plane.getCapacity());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(200, plane.getTotalWeight());
    }
}
