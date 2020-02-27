package battleship;
import battleship.*;
//import battleship.util.*;
//import io.*;
/**
 * A ship with life points
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class Ship {

	//Attributs
	private int lifePoints;

	//Constructeur
    /**
     * Create a ship
     * @param life Number of life points (life must be int > 0)
     */
    public Ship(int lifePoints) throws IllegalAccessException{
    	if (lifePoints<1){
    		throw new IllegalAccessException("Lifepoints can't be under 1");
    	}
    	this.lifePoints=lifePoints;
    }

	//Methodes
	/**
	 * Return life points
	 * @return Return Life points of this ship
	 */
	public int getLifePoint(){
		return this.lifePoints;
	}

	/**
	 * Reduce the life points by 1
	 */
	public  void hitted (){
		this.lifePoints=this.lifePoints-1;
	}

	/**
	 * Return true if the ship have 0 life points or false
	 * @return Return True when 0 life points or False
	 */
	public boolean isSunk (){
		return this.lifePoints==0;
	}
}