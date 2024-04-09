/*
 * DO NOT MAKE ANY CHANGES
 */

import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class TimeTest {
    @Test
    public void testPrivateFields() {
        Field hourField;
        Field minuteField;
        Field secondField;

        try {
            hourField = Time.class.getDeclaredField("hour");
            minuteField = Time.class.getDeclaredField("minute");
            secondField = Time.class.getDeclaredField("second");
        } catch (NoSuchFieldException e) {
            fail("One or more of the fields hour, minute, or second is missing");
            return;
        }

        assertTrue("Hour field is not private",Modifier.isPrivate(hourField.getModifiers()));
        assertTrue("Minute field is not private", Modifier.isPrivate(minuteField.getModifiers()));
        assertTrue("Second field is not private", Modifier.isPrivate(secondField.getModifiers()));
    }

    @Test
    public void testGettersSetters(){
        Time time = new Time();

        //Test setters
        time.setHour(1);
        time.setMinute(30);
        time.setSecond(45);

        assertEquals("Hour is not set correctly", 1, time.getHour());
        assertEquals("Minute is not set correctly", 30, time.getMinute());
        assertEquals("Second is not set correctly", 45, time.getSecond());
    }
    
}
