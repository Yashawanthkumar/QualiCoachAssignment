package Qualitest.QualiCoachAssignment;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static final  Logger logger=LogManager.getLogger(AppTest.class);
    
    @Test
    public void demo()
    {
    	System.out.println("Inherited");
    }
}