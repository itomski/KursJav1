package de.lubowiecki.jav1.uebung3;

import java.awt.Point;

public class Board {
	
//	{
//		{null, null, null},
//		{null, @, null},
//		{null, null, null}
//	}
	
	private Robot[][] fields;

	public Board(int rows, int cols) {
		this.fields = new Robot[rows][cols];
	}
	
	public Board() {
		this(10, 10);
	}
	
	@Override
	public String toString() {
		// Optional, führt zur besserer Performance
//		int size = (int)(fields.length /* Zeilen */ * fields[0].length /* Spalten */ * 1.2 /* Faktor */);
//		StringBuilder output = new StringBuilder(size);
		
		StringBuilder output = new StringBuilder();
		
		for (int i = 0; i < fields.length; i++) {
			for(int j = 0; j < fields[i].length; j++) {
				if(fields[i][j] != null) {
					output.append("@"); // Zelle ist gefüllt
				}
				else {
					output.append("X"); // Zelle ist leer
				}
			}
			output.append("\n"); // Nächste Zeile
		}
		
//		for (Robot[] cols : fields) {
//			for (Robot cell : cols) {
//				output.append((cell != null) ? "@" : "X");
//			}
//			output.append("\n");
//		}
		
		return output.toString();
	}

	public boolean set(Robot robot) {
		try {
			// TODO: Prüfen ob das anvisierte Feld belegt ist
			
			// Roboter wird auf dem Bord positioniert
			// x und y müssen >= 0 und < als Länge des Arrays
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
