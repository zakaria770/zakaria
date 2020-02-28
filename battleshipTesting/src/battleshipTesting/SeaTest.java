package battleshipTesting;

import static org.junit.Assert.*;
import org.junit.Test;

import battleship.*;
import battleship.util.*;

public class SeaTest {	

    @Test
    public void testShootOk() {
        Sea sea = new Sea(5,5);
        Position position = new Position(3,3);
        assertEquals(sea.shoot(position),Answer.MISSED);
    }
    
    @Test (expected= ArrayIndexOutOfBoundsException.class)
    public void testShootOut() {
        Sea sea = new Sea(3,3);
        Position position = new Position(5,5);
        sea.shoot(position);
    }

    @Test
    public void testAddShipHori() throws IllegalAccessException {
        Sea sea = new Sea(3,3);
        Ship ship1 = new Ship(3);
        Position position1 = new Position(2,0);
        sea.addShipHorizontally(ship1,position1);
        assertSame(sea.getBoard()[2][2].getShip(),ship1);
    }

    @Test (expected= IllegalStateException.class)
    public void testAddShipHoriOutOfBoard() throws IllegalAccessException {
        Sea sea = new Sea(3,3);
        Ship ship1 = new Ship(2);
        Position position1 = new Position(0,2);
        sea.addShipHorizontally(ship1,position1);
    }

    @Test (expected= IllegalStateException.class)
    public void testAddShipHoriOnOtherVertiShip() throws IllegalAccessException {
        Sea sea = new Sea(3,3);
        Ship ship1 = new Ship(2);
        Position position1 = new Position(0,2);
        sea.addShipVertically(ship1,position1);
        Ship ship2 = new Ship(3);
        Position position2 = new Position(1,0);
        sea.addShipHorizontally(ship2,position2);
    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(SeaTest.class);
    }

}
