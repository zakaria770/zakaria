package battleship;
import battleship.*;
import battleship.util.*;
/**
 * A board with cell
 *
 * @author OUAICHOUCHE
 * @version 1.0
 */

public class Sea {
	/*
	 * Create a board with cell
	 */

	//Attributs
	private Cell[][] board;
	private int totalLF;

	//Constructeur

    /**
     * Create a board
     * @param height The height of the board
     * @param width The width of the board
     */
    public Sea(int height, int width){
    	this.totalLF = 0;
    	this.board = new Cell[height][width];
    	for (int cx=0; cx<height; cx++){
    		for (int cy=0; cy<width; cy++){
    			this.board[cx][cy] = new Cell();
    		}
    	}
    }


	//Methodes
	/**
	 * Return the board
	 * @return Return the board
	 */
	public Cell[][] getBoard(){
		return this.board;
	}

	/**
	 * Return the total life points remaining of ships on the sea
	 * @return Return total life points remaining
	 */
	public int gettotalLF(){
		return this.totalLF;
	}

	/**
	 * Add the ship given  vertically at given position
	 * @param ship The ship to add on the board
	 * @param position The position where the ship will add
	 * @throws IllegealStateException
	 */
	public Answer shoot (Position position) {
		Cell debug = this.board[position.getX()][position.getY()];
		Answer msg = debug.shot();
		if ((msg==Answer.HIT) || (msg==Answer.SUNK)){
			this.totalLF-=1;
		}
		return msg;
	}


	/** displays the board line by line and cell by cell,
	* the display changes for the defender or the opponent, defined
	* by the <code>defender</code> argument
	* @param defender <code>true</code> if display is for defender,
	* <code>false</code> if for opponent
	*/
	public void display(boolean defender) {
		for (int x=0; x<this.board.length; x++) {
			for (int y=0; y<this.board[0].length; y++) {
				System.out.print(this.board[x][y].getCharacter(defender));
			}
			System.out.print("\n");
		}
	}

	public static void main (String[] args){
		Sea game = new Sea (5,5);
		game.addShipVertically(new Ship (3), new Position(0,0));
		game.addShipHorizontally(new Ship (2), new Position(0,1));
		System.out.print("life point remaining : "+game.gettotalLF());
		System.out.print("\n");
		game.display(true);
		System.out.print("\n");
		game.display(false);
		System.out.print("\n");
		game.shoot(new Position(3,3));
		game.shoot(new Position(0,0));
		System.out.print("life point remaining : "+game.gettotalLF());
		System.out.print("\n");
		game.display(true);
		System.out.print("\n");
		game.display(false);
		System.out.print("\n");
	}







	 	

}