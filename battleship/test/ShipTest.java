import org.junit.*;
import static org.junit.Assert.*;
import org.junit.Test;
//import battleship.*; 
import battleship.Ship;


public class ShipTest {	

    @Test
    public void testShipCreationAndHitted() {
        Ship ship = new Ship(5);
        ship.hitted();
        assertEquals(4,ship.getLifePoint()); 
    }
    
    @Test
    public void testShipSunk() {
        Ship ship = new Ship(2);
        ship.hitted();
        ship.hitted();
        assertTrue(ship.isSunk());
    }

    @Test 
    public void testShipCreation() {
        Ship ship = new ship(5);
        assertEquals(5,ship.getLifePoint());
    }

    @Test
    public void testShipNotSunk() {
        Ship ship = new Ship(2);
        ship.hitted();
        assertFalse(ship.isSunk());
    }



    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(ShipTest.class);
    }

}
