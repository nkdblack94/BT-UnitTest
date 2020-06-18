import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TriangularClassificationTest {

    @Test
    public void triangleTest1 (){
        int a = 2;
        int b = 2;
        int c = 2;

        String triangle = "equilateral triangle";
        assertEquals(triangle, TriangularClassification.TriangularClassification(a, b, c));
    }

    @Test
    public void triangleTest2 (){
        int a = 2;
        int b = 2;
        int c = 3;

        String triangle = "isosceles triangle";
        assertEquals(triangle, TriangularClassification.TriangularClassification(a,b,c));
    }

    @Test
    public void triangleTest3 (){
        int a = 3;
        int b = 4;
        int c = 5;

        String triangle = "regular triangle";
        assertEquals(triangle, TriangularClassification.TriangularClassification(a,b,c));
    }

    @Test
    public void triangleTest4 (){
        int a = 8;
        int b = 2;
        int c = 3;

        String triangle = "not triangle";
        assertEquals(triangle, TriangularClassification.TriangularClassification(a,b,c));
    }

    @Test
    public void triangleTest5 (){
        int a = -1;
        int b = 2;
        int c = 1;

        String triangle = "not triangle";
        assertEquals(triangle, TriangularClassification.TriangularClassification(a,b,c));
    }

    @Test
    public void triangleTest6 (){
        int a = 0;
        int b = 1;
        int c = 1;

        String triangle = "not triangle";
        assertEquals(triangle, TriangularClassification.TriangularClassification(a,b,c));
    }
}
