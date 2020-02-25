package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    // Testing Object Equality
    public Boolean EqualityTest(String a, String b)
    {
        if (a.equals(b))
        {
            return true;
        }else
            return false;
    }

    //Testing Object Identity
    public Boolean IdentityTest(String a, String b)
    {
        if(a == b)
            return true;
        else
            return false;
    }

    //Failed Testing
    public Boolean FailTest(String a, String b)
    {
        if (a.equals(b))
        {
            return true;
        }else
            return false;
    }

    //Timeout Testing
    public int TimeoutTest(){
        final int a = 1 + (int) (30000 * Math.random());
        return a;
    }
}
