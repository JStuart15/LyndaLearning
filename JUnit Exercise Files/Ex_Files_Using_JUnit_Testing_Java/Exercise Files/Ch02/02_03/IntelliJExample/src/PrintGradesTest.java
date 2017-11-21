import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Producer on 8/29/2016.
 */
public class PrintGradesTest {
    @Test
    public void test()
    {
        PrintGrades pg = new PrintGrades();
        String result = pg.print(90);
        assertEquals("You got an A!", result);
    }

}