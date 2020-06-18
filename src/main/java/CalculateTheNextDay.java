public class CalculateTheNextDay {
    public static int[] Abc(int day, int moth, int year) {
        int[] arr = new int[3];
        switch (moth) {
            case 2:
                if (day >= 28) {
                    day = 1;
                    ++moth;
                } else ++day;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day >= 31) {
                    day = 1;
                    ++moth;
                    if (moth > 12){
                        moth = 1;
                        ++year;
                    }
                } else ++day;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day >= 30) {
                    day = 1;
                    ++moth;
                } else ++day;
                break;
            default:
                System.out.println("sai");
        }
        arr[0] = day;
        arr[1] = moth;
        arr[2] = year;

        return arr;
    }
}
