package de.lubowiecki.jav1;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] a = {1,3,17};
		int b[];
		//b = {1,3,17}; // Funktioniert nur in Verbindung mit Deklaration
		b = new int[]{1,3,17};
		
		String[] strArr = new String[1_000_000];
		int[] intArr = new int[1_000_000];
		
		int[] c,d,e;
		int[] f,g[],h;
		
		System.out.println(Integer.MAX_VALUE);

		int[][] arr = new int[10][];
		arr[0] = new int[]{7,9,22,8};
		arr[1] = new int[]{7};
		
		int i = 100;
		long l1 = i; // Promotion von int zu long
		long sum = i + l1; // i wird zu long, erg ist auch long
		
		byte b1 = 10;
		byte b2 = 20;
		int bSum = b1 + b2; // Math-Op. Operanden werden mind. auf int angehoben
		
		b1 += 10; // b1 = (byte)(b1 + 10);
		b1++; // b1 = (byte)(b1 + 1);
		
		b1 = 126;
		b1++;
		b1++;
		System.out.println(b1);
		
		b1 = 126;
		b1 += 2000;
		System.out.println(b1);
		
		int[] arr15;
		//System.out.println(arr15); // Error: Muss vor der Verwendung initialisiert werden
		
		// Zusammengesetzte Operatoren und Increment und Decrement funktionieren nur mit Variablen!!!!!
		int x = 10;
		x++;
		
		System.out.println("Moin" + 7 * 2);
		//System.out.println("Moin" * 7 + 2); // Error
		
	}

}
