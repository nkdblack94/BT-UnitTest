import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzResultsTest {
    @Test
    public void FizzBuzzTest1 (){
        int number = 3;

        String result = "Fizz";
        assertEquals(result, FizzBuzzResults.FizzBuzzResults(number));
    }

    @Test
    public void FizzBuzzTest2 (){
        int number = 5;

        String result = "Buzz";
        assertEquals(result, FizzBuzzResults.FizzBuzzResults(number));
    }

    @Test
    public void FizzBuzzTest3 (){
        int number = 15;

        String result = "FizzBuzz";
        assertEquals(result, FizzBuzzResults.FizzBuzzResults(number));
    }

    @Test
    public void FizzBuzzTest4 (){
        int number = 16;

        String result = "Not divisible";
        assertEquals(result, FizzBuzzResults.FizzBuzzResults(number));
    }
}
