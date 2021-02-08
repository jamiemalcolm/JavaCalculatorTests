import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    @Test
    public void hasVolume(){
        WaterBottle waterBottle = new WaterBottle();
        assertEquals(100, waterBottle.getVolume());
    }



}
