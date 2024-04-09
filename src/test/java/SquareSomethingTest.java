/*
 * DO NOT MAKE ANY CHANGES
 */

import org.junit.Test;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;


public class SquareSomethingTest {
    @Test
    public void testOverload(){
        try {
            Method intSquare = SquareSomething.class.getDeclaredMethod("square", int.class);
            Method doubleSquare = SquareSomething.class.getDeclaredMethod("square", double.class);
            Method floatSquare = SquareSomething.class.getDeclaredMethod("square", float.class);

            assertTrue("square method for int is not static", Modifier.isStatic(intSquare.getModifiers()));
            assertTrue("square method for double is not static", Modifier.isStatic(doubleSquare.getModifiers()));
            assertTrue("square method for float is not static", Modifier.isStatic(floatSquare.getModifiers()));
        } catch (NoSuchMethodException e) {
            fail("Required method overload does not exist");
        }
    }
}
