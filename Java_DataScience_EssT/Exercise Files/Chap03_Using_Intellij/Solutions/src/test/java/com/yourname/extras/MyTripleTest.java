package com.yourname.extras;

import com.yourname.MyTripling;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Charles Kelly.
 */
public class MyTripleTest
{
    @Test
    /* ensure that class MyTripling is accessible and can be instantiated */
    public void testInstantiation()
    {
        MyTripling myTriple = new MyTripling();

    }

    @Test
    public void testWrongCalculation()
    {
        MyTripling myTriple = new MyTripling();
        int result = myTriple.createTriple(5);
        assertNotEquals(20, result);
    }
}