package challenge7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AreaRectangularRoomTest {
    private AreaRectangularRoom areaRectangularRoom = new AreaRectangularRoom(15,20);

    @Test
    public void positiveTest() {
        assertEquals(300,areaRectangularRoom.getSquareFeetArea());
        assertEquals(27.871,areaRectangularRoom.getSquareMeterArea());
    }
}
