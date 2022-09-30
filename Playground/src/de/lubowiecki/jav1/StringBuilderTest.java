package de.lubowiecki.jav1;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.length()); // Anzahl von Zeichen im internen Array
		System.out.println(sb.capacity()); // Größe des internen Arrays
		
		System.out.println();
		sb.append("0123456789");
		
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println();
		sb.append("0123456789");
		
		// Wenn capacity aufgebraucht ist, wird das interne Array automatisch
		// vergrößert. Neue Capacity = alte Capacity * 2 + 2
		System.out.println(sb.length());
		System.out.println(sb.capacity()); // 34
		
		System.out.println();
		sb.append("0123456789");
		sb.append("0123456789");
		
		System.out.println(sb.length()); // 40
		System.out.println(sb.capacity()); // 70
		
		System.out.println("-------------------");
		
		// Statt mehrmals den SB zu vergrößern ist es besser gleich einen mit
		// ausreichender Capacity zu bauen
		sb = new StringBuilder(1000); // int steht für die gewünschte Capacity
		System.out.println(sb.length()); // 0
		System.out.println(sb.capacity()); // 1000
		
		System.out.println();
		sb.append("0123456789");
		sb.trimToSize(); // Verkleinert die Capacity auf die benötigte Anzahl von Zeichen
		System.out.println(sb.length()); // 10
		System.out.println(sb.capacity()); // 10
		
		System.out.println("-------------------");
		sb = new StringBuilder("ABCD"); // Capacity = Anzahl benötigter Zeichen + 16
		System.out.println(sb.length()); // 4
		System.out.println(sb.capacity()); // 4 + 16 = 20
		
		String s = sb.toString();
		System.out.println(sb); // hier wird toString automatisch verwendet
		
//		String str = "Hallo";
//		System.out.println(str.length());
//		
//		int[] arr = {1,2,3};
//		System.out.println(arr.length);

	}

}
