package de.lubowiecki.jav1;

public class KonstruktorTest {
	
	public static void main(String[] args) {
		
		Person p = new Person("Peter", "Parker");
		System.out.println(p);
		
		p = new Person();
		System.out.println(p);
		
		p = new Person("Bruce", "Banner", true);
		System.out.println(p);
		
		p = null;
		System.gc();
	}
}
