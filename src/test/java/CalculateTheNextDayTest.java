import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CalculateTheNextDayTest {

    @Test
    public void nextDay1() {
        int day = 1;
        int moth = 1;
        int year = 2018;
        int[] nextDay = {2,1,2018};

        int[] result = CalculateTheNextDay.CalculateTheNextDayTest(day, moth, year);
        assertArrayEquals(nextDay, result);
    }

    @Test
    public void nextDay2() {
        int day = 31;
        int moth = 1;
        int year = 2018;
        int[] nextDay = {1,2,2018};

        int[] result = CalculateTheNextDay.CalculateTheNextDayTest(day, moth, year);
        assertArrayEquals(nextDay, result);
    }

    @Test
    public void nextDay3() {
        int day = 30;
        int moth = 4;
        int year = 2018;
        int[] nextDay = {1,5,2018};

        int[] result = CalculateTheNextDay.CalculateTheNextDayTest(day, moth, year);
        assertArrayEquals(nextDay, result);
    }

    @Test
    public void nextDay4() {
        int day = 28;
        int moth = 2;
        int year = 2018;
        int[] nextDay = {1,3,2018};

        int[] result = CalculateTheNextDay.CalculateTheNextDayTest(day, moth, year);
        assertArrayEquals(nextDay, result);
    }

    @Test
    public void nextDay5() {
        int day = 29;
        int moth = 2;
        int year = 2020;
        int[] nextDay = {1,3,2020};

        int[] result = CalculateTheNextDay.CalculateTheNextDayTest(day, moth, year);
        assertArrayEquals(nextDay, result);
    }

    @Test
    public void nextDay6() {
        int day = 31;
        int moth = 12;
        int year = 2018;
        int[] nextDay = {1,1,2019};

        int[] result = CalculateTheNextDay.CalculateTheNextDayTest(day, moth, year);
        assertArrayEquals(nextDay, result);
    }
}
