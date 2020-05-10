import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class checkTriangleTest {
    @Test
    void testIsTriangle(){
        int edge1 = 5;
        int edge2 = 4;
        int edge3 = 5;
        boolean expected = true;
        boolean result = checkTriangle.isTriangle(edge1,edge2,edge3);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("test tam giac deu")
    void testKindOfTriangle(){
        int edge1 = 5;
        int edge2 = 4;
        int edge3 = 3;
        String expected ="tam giac can";
        String result = checkTriangle.kindOfTriangle(edge1,edge2,edge3);
        assertEquals(expected,result);
    }

}