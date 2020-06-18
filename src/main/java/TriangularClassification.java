public class TriangularClassification {
    public static String TriangularClassification (int a, int b, int c){
        String result = "";
        if (a == b && a == c){
           result = "equilateral triangle";
        } else if (a == b && a < c || a == c && a < b){
           result = "isosceles triangle";
        } else if (a + b > c && a + c > b && c + b > a){
            result = "regular triangle";
        } else {
            result = "not triangle";
        }
        return result;
    }
}
