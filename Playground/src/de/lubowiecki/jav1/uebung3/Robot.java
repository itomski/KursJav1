package de.lubowiecki.jav1.uebung3;

import java.awt.Point;

public class Robot {
	
	private Point pos;
	
	private Direction dir = Direction.EAST;
	
	private Board board; 
	
	public Robot(int x, int y, Board bord) {
		pos = new Point(x, y);
		this.board = bord;
		this.board.set(this); // Roboter auf dem Spielfeld positionieren
	}
	
	public Robot(Board board) {
		this(0, 0, board);
	}
	
	public Robot() {
	}
	
	public enum Direction {
		EAST /* 0 */, SOUTH /* 1 */, WEST /* 2 */, NORTH /* 3 */;
	}
	
	public Point getPos() {
		return new Point(pos); // Gibt eine Kopie der Position zurück
	}

	private void rotate(boolean positive) {
		//  dir.ordinal() liefert die Nummer der aktuellen Richtung
		int newOrd = (positive ? dir.ordinal() + 1 : dir.ordinal() + 3) % 4;
		dir = Direction.values()[newOrd];
	}
	
	private boolean move(boolean positive) {
		
		// Aktuelle Position wird in old als Backup gespeichert
		// Kann die Bewegung nicht ausgeführt werden, wird die alte Position zu aktueller Position
		Point old = new Point(pos);
		
		switch(dir) {
			case EAST:
				if(positive)
					pos.y++;
				else
					pos.y--;
				break;
				
			case WEST:
				if(positive)
					pos.y--;
				else
					pos.y++;
				break;
				
			case SOUTH:
				if(positive)
					pos.x++;
				else
					pos.x--;
				break;	
		
			case NORTH:
				if(positive)
					pos.x--;
				else
					pos.x++;
				break;
		}
		
		// Kann die gewünschte Bewegung ausgeführt werden?
		if(board.set(this)) {
			// Wenn ja, muss die alte Position gesäubert werden
			board.clear(old);
			return true;
		}
		// Wenn nein, bleibt der Roboter an seiner alten Position stehen
		// Das Backup (old) wird wieder als aktuelle Position verwendet
		pos = old;
		return false;
	}
	
	public void rotateRight() {
		rotate(true);
	}
	
	public void rotateLeft() {
		rotate(false);
	}
	
	public boolean moveForward() {
		return move(true);
	}
	
	public boolean moveBackward() {
		return move(false);
	}
	
//	public boolean moveBackward() {
//		// TODO: muss noch implementiert werden
//		throw new UnsupportedOperationException("ist noch nicht implementiert");
//	}
	
	@Override
	public String toString() {
		return "Richtung: " + dir + ", Position: x" + pos.x + ", y" + pos.y;
	}
}
