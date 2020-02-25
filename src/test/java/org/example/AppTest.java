package org.example;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void equalityTest()
    {
        App a = new App();

        assertEquals(true, a.EqualityTest("First Test", "First Test"));
    }

    @Test
    public void identityTest()
    {
        App a = new App();

        assertSame(true, a.IdentityTest("Second Test", "Second Test"));
        assertNotSame(false, a.IdentityTest("Second Test", "Second Test"));
    }

    @Test
    public void failTest()
    {
        App a = new App();

        assertEquals(false, a.FailTest("Third Test", "Failure"));
    }

    @Test (timeout = 5)
    public void timeoutTest()
    {
        System.out.println(" * UtilsJUnit4Test:test method 2 − timeoutTest( )") ;
        App a = new App(){};
        a.TimeoutTest();
        System.out.printf("Computing %d!%n", a.TimeoutTest());
    }
    @Ignore
    @Test (timeout = 5)
    public void disablingTest()
    {
        System.out.println(" * UtilsJUnit4Test:test method 2 − timeoutTest( )") ;
        App a = new App(){};
        a.TimeoutTest();
        System.out.printf("Computing %d!%n", a.TimeoutTest());
    }
}
