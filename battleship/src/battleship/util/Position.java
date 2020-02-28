package battleship.util;

import battleship.*;
/**
 * Position x and y for board of sea
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class Position {

	//Attributs
	private int x;
	private int y;

	//Constructeur

	/**
	 * Create a position class with x and y ( which must be superior to -1)
	 * @param x The position x for height
	 * @param y The position y for width
	 * @throws IllegalArgumentException
	 */
	public Position(int x, int y)throws IllegalArgumentException{
		if (x<0 || y<0){
			throw new IllegalArgumentException("Params of position must int superior to -1");
		}
		this.x=x;
		this.y=y;
	}

	/**
	 * Return the attribut x
	 * @return Return the attribut x
	 */
	public int getX(){
		return this.x;
	}

	/**
	 * Return the attribut y
	 * @return Return the attribut y
	 */
	public int getY(){
		return this.y;
	}

	/**
	 * Return true if position are equals or false if not
	 * @param o Other position object
	 * @return True if poisition are same or false if not
	 */
	public boolean equals(Position o){
		return this.x==o.getX() && this.y==o.getY();
	}

	/**
	 * Return the string description of position
	 * @return Return the string description of position
	 */
	public String toString(){
		return "Position height = "+this.x+"and width = "+this.y;
	}
}