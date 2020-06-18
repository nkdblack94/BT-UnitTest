public class CalculateTheNextDay {
    public static int[] CalculateTheNextDayTest(int day, int moth, int year) {
        boolean isLeapYear = LeapYearTest(year);
        int DayMaxMoth = 0;
        switch (moth) {
            case 2:
                if (isLeapYear) {
                    DayMaxMoth = 29;
                } else {
                    DayMaxMoth = 28;
        }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                DayMaxMoth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                DayMaxMoth = 30;
                break;
            default:
        }

        if (day == DayMaxMoth){
            day = 1;
            if (moth == 12){
                moth = 1;
                year += 1;
            } else {
                moth += 1;
            }
        } else {
            day += 1;
        }

        int[] array= {day, moth, year};
        return array;
    }

    public static boolean LeapYearTest(int year) {
        boolean isLeapYear = false;
        boolean isDivisibleBy4 = year % 4 == 0;
        boolean isDivisibleBy100 = year % 100 == 0;
        boolean isDivisibleBy400 = year % 400 == 0;
        if (year > 0) {
            if ((isDivisibleBy4 && !isDivisibleBy100) || (isDivisibleBy100 && isDivisibleBy400)) {
                isLeapYear = true;
            }
        }
        return isLeapYear;
    }
}
