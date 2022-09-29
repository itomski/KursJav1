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
	
	public enum Direction {
		EAST, SOUTH, WEST, NORTH;
	}
	
	public Point getPos() {
		return new Point(pos); // Gibt eine Kopie der Position zurück
	}

	public void setPos(Point pos) {
		this.pos = pos;
	}

	private void rotate(boolean positive) {
		int newOrd = (positive ? dir.ordinal() + 1 : dir.ordinal() + 3) % 4;
		dir = Direction.values()[newOrd];
	}
	
	private boolean move(boolean positive) {
		
		Point old = new Point(pos);
		
		switch(dir) {
			case EAST:
				if(positive)
					pos.x++;
				else
					pos.x--;
				break;
				
			case WEST:
				if(positive)
					pos.x--;
				else
					pos.x++;
				break;
				
			case SOUTH:
				if(positive)
					pos.y++;
				else
					pos.y--;
				break;	
		
			case NORTH:
				if(positive)
					pos.y--;
				else
					pos.y++;
				break;
		}
		
		if(board.set(this)) {
			board.clear(old);
			return true;
		}
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
	
	@Override
	public String toString() {
		return "Richtung: " + dir + ", Position: x" + pos.x + ", y" + pos.y;
	}
}
