package de.lubowiecki.jav1.uebung3;

import java.awt.Point;

public class Board {
	
	private Robot[][] fields;

	public Board(int rows, int cols) {
		this.fields = new Robot[rows][cols];
	}
	
	public Board() {
		this(100, 100);
	}
	
	@Override
	public String toString() {
		int size = (int)(fields.length /* Zeilen */ * fields[0].length /* Spalten */ * 1.2 /* Faktor */);
		StringBuilder output = new StringBuilder(size);
		
		for (Robot[] cols : fields) {
			for (Robot cell : cols) {
				output.append((cell instanceof Robot) ? "@" : "X");
			}
			output.append("\n");
		}
		
		return output.toString();
	}

	public boolean set(Robot robot) {
		try {
			// TODO: Prüfen ob das anvisierte Feld belegt ist
			fields[robot.getPos().x][robot.getPos().y] = robot;
			return true;
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			return false;
		}
	}

	public void clear(Point pos) {
		fields[pos.x][pos.y] = null;
	}
}
