public class FizzBuzzResults {
    public static String FizzBuzzResults (int number){
        boolean firstNumber = number % 3 == 0;
        boolean secondNumber = number % 5 == 0;
        boolean thirdNumber = number % 3 == 0 && number % 5 == 0;
        String result = "";

        if (thirdNumber){
            result = "FizzBuzz";
        } else if (firstNumber){
            result = "Fizz";
        } else if (secondNumber){
            result = "Buzz";
        } else {
            result = "Not divisible";
        }
        return result;
    }
}
