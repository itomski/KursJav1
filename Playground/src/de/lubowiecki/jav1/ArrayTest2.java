package de.lubowiecki.jav1;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[] zahlen = {0,1,2,3,4,5,6,7,8,9};
		//zahlen = new int[]{0,1,2,3,4,5,6,7,8,9};
		//zahlen = new int[-10];
		System.out.println(zahlen[3]);
		//System.out.println(zahlen[100]);
		
		try {
			System.out.println(zahlen[-100]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Ende");
	}

}
