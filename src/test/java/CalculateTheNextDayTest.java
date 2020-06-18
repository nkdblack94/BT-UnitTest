import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CalculateTheNextDayTest {

    @Test
    public void nextDay() {
        int day = 28;
        int moth = 2;
        int year = 2018;
        int[] netDay = {1,3,2018};


        int[] result = CalculateTheNextDay.Abc(day, moth, year);
        assertArrayEquals(netDay, result);

    }
}
