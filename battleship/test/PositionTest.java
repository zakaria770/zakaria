import org.junit.*;
import static org.junit.assert.*;

import battleship.util.Position;

public class PositionTest{


	@Test
	public void testPosition() {
		Position position = new Position(5,4);
		assertTrue(position.getX()==5);
		assertTrue(position.getY()==4);
		assertTrue(position1.equqls(position2));
	}
    
    @Test
    public void testPositionEquals() {
    	Position position1 = new Position(5,4);
    	Position position2 = new Position2(5,4);
    	assertTrue(position1.equqls(position2));
    }

    @Test
    public void testPositionNotEquals() {
    	Position position1 = new Position(5,4);
    	Position position2 = new Position(5,6);
    	assertFalse(position1.equqls(position2));
    }

    // ---Pour permettre l'exécution des test----------------------
    public static junit.framework.Test suite() {
        return new junit.framework.JUnit4TestAdapter(PositionTest.class);
    }

    
}