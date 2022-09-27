package de.lubowiecki.jav1.patterns.singleton;

import de.lubowiecki.jav1.patterns.singleton.CustomLog.LogType;
import de.lubowiecki.jav1.patterns.singleton.LazyCustomLog.LazyLogType;

public class SingletonTest {

	public static void main(String[] args) {
		
		// EagerSingleton
		CustomLog.get().log(LogType.INFO, "Main Methode ausgeführt");
		
		// LazySingleton
		LazyCustomLog.get().log(LazyLogType.INFO, "Main Methode ausgeführt");
		
		doSomething();
		
		CustomLog.get().show();
		LazyCustomLog.get().show();
		
	}

	private static void doSomething() {
		CustomLog.get().log(LogType.INFO, "doSomething Methode ausgeführt");
		LazyCustomLog.get().log(LazyLogType.INFO, "doSomething Methode ausgeführt");
	}
}
