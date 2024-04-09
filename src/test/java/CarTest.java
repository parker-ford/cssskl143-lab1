/*
 * DO NOT MAKE ANY CHANGES
 */

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CarTest {
    @Test
    public void testToStringOverride() {
        String make = "Toyota";
        String model = "Camry";
        Car car = new Car(make, model);

        assertTrue("toString does not contain make", car.toString().contains(make));
        assertTrue("toString does not contain model", car.toString().contains(model));
    }

    @Test
    public void testContructorOverload(){
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Subaru");

        assertEquals("Car make is not as expected", "Toyota", car1.make);
        assertEquals("Car model is not as expected", "Camry", car1.model);
        assertEquals("Car make is not as expected", "Subaru", car2.make);
    }
}
