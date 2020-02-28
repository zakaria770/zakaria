package battleshipTesting;

import static org.junit.Assert.*;
import org.junit.Test;

import battleship.Ship;


public class ShipTest {	

    @Test
    public void testShipCreationAndHitted() throws IllegalAccessException {
        Ship ship = new battleship.Ship(5);
        ship.hitted();
        assertEquals(4,ship.getLifePoint()); 
    }
    
    @Test
    public void testShipSunk() throws IllegalAccessException {
        Ship ship = new Ship(2);
        ship.hitted();
        ship.hitted();
        assertTrue(ship.isSunk());
    }

    @Test 
    public void testShipCreation() throws IllegalAccessException {
        Ship ship = new Ship(5);
        assertEquals(5,ship.getLifePoint());
    }

    @Test
    public void testShipNotSunk() throws IllegalAccessException {
        Ship ship = new Ship(2);
        ship.hitted();
        assertFalse(ship.isSunk());
    }



    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(ShipTest.class);
    }

}

