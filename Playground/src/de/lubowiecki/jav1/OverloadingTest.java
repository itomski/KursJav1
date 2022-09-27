package de.lubowiecki.jav1;

public class OverloadingTest {

	public static void main(String[] args) {
		
		// 1. Methode mit exakt passenden Typ
		// 2. primitive Widening
		// 3. Autoboxing
		// 4. Autoboxing + komplex Widening
		// 5. VarArg (immer als letztes)
		
		
		doSomething(10);
		
//		doSomething(10l);
//		
//		doSomething((byte) 10);
//		
//		doSomething(10.0);
		
		// Widening, automatisch vom kleineren zum größeren Datentyp
		// Narrowing, KEIN automstisches Verkleinern von Datentypen möglich
		
		int i = 10;
		Integer i2 = 10; // Wrapper, Autoboxing von int auf Integer
		
		//Integer i3 = (byte) 10; // Autoboxing von byte zu Byte, Error: Widening von Byte auf Integer
	}
	
//	private static void doSomething(int a) {
//		System.out.println("doSomething: int");
//	}
	
	private static void doSomething(byte a) {
		System.out.println("doSomething: byte");
	}
	
//	private static void doSomething(double a) {
//		System.out.println("doSomething: double");
//	}
	
//	private static void doSomething(Integer a) {
//		System.out.println("doSomething: Integer");
//	}
	
//	private static void doSomething(Object a) {
//		System.out.println("doSomething: Object");
//	}
	
	private static void doSomething(int... a) {
		System.out.println("doSomething: int VarArg");
	}
}
